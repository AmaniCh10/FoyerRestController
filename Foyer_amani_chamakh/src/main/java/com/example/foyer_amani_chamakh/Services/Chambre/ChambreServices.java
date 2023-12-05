package com.example.foyer_amani_chamakh.Services.Chambre;

import com.example.foyer_amani_chamakh.DAO.Entities.Chambre;
import com.example.foyer_amani_chamakh.DAO.Entities.Etudi;
import com.example.foyer_amani_chamakh.DAO.Repository.BlocRepository;
import com.example.foyer_amani_chamakh.DAO.Repository.ChambreRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServices implements IChambreServices {
    @Autowired
    ChambreRepo CR;

    @Override
    public Chambre addChambre(Chambre b) {
        return CR.save(b);
    }

    @Override
    public List<Chambre> addallChambre(List<Chambre> b) {
        return CR.saveAll(b);
    }

    @Override
    public Chambre updateChambre(Chambre b) {
        return CR.save(b);
    }

    @Override
    public List<Chambre> updateallChambre(List<Chambre> b) {
        return CR.saveAll(b);
    }

    @Override
    public List<Chambre> findAllChambre() {
        return CR.findAll();
    }


    @Override
    public Chambre findChambrebyId(long id) {
        return CR.findById(id).orElse(Chambre.builder().idChambre(0L).numChambre("bloc bizarre").build());
    }

    @Override
    public void deleteChambre(Chambre b) {
        CR.delete(b);

    }

    @Override
    public void deletebyChambre(long id) {
        CR.deleteById(id);

    }
}
