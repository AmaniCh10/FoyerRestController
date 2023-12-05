package com.example.foyer_amani_chamakh.Services.Foyer;

import com.example.foyer_amani_chamakh.DAO.Entities.Bloc;
import com.example.foyer_amani_chamakh.DAO.Entities.Foyer;
import com.example.foyer_amani_chamakh.DAO.Entities.University;
import com.example.foyer_amani_chamakh.DAO.Repository.FoyerRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerServices implements IFoyerServices{
    @Autowired
    FoyerRepo fr;
    @Override
    public Foyer addFoyer(Foyer b) {
        return fr.save(b);
    }

    @Override
    public List<Foyer> addAllFoyer(List<Foyer> ets) {
return fr.saveAll(ets);    }

    @Override
    public Foyer updateFoyer(Foyer b) {
        return fr.save(b);
    }

    @Override
    public List<Foyer> updateAllFoyer(List<Foyer> foyers) {
return fr.saveAll(foyers);    }

    @Override
    public List<Foyer> findAllFoyer() {
        return fr.findAll();
    }

    @Override
    public Foyer findFoyerById(long id) {
        return fr.findById(id).orElse(Foyer.builder().idFoyer(0L).nomFoyer("bloc bizarre").build());
    }

    @Override
    public void deleteFoyer(Foyer b) {
        fr.delete(b);

    }

    @Override
    public void deleteFoyerById(long id) {
     fr.deleteById(id);
    }
}
