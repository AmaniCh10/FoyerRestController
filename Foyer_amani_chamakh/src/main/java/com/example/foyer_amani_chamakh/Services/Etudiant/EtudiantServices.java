package com.example.foyer_amani_chamakh.Services.Etudiant;

import com.example.foyer_amani_chamakh.DAO.Entities.Bloc;
import com.example.foyer_amani_chamakh.DAO.Entities.Etudi;
import com.example.foyer_amani_chamakh.DAO.Repository.ChambreRepo;
import com.example.foyer_amani_chamakh.DAO.Repository.EtudiantRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EtudiantServices implements IEtudiantServices{
    @Autowired
    EtudiantRepo er;
    @Override
    public Etudi addEt(Etudi b) {
        return er.save(b);
    }

    @Override
    public List<Etudi> addAllEt(List<Etudi> ets) {
        return er.saveAll(ets);
    }

    @Override
    public Etudi updateEt(Etudi b) {
        return er.save(b);
    }

    @Override
    public List<Etudi> updateAllEt(List<Etudi> etss) {
        return er.saveAll(etss);
    }

    @Override
    public List<Etudi> findAllEt() {
        return er.findAll();
    }

    @Override
    public Etudi findEtById(long id) {
        return er.findById(id).orElse(Etudi.builder().idEtud(0L).nomet("bloc bizarre").build());
    }

    @Override
    public void deleteEt(Etudi b) {
        er.delete(b);

    }

    @Override
    public void deleteEtById(long id) {

        er.deleteById(id);

    }
}
