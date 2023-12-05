package com.example.foyer_amani_chamakh.Services.University;

import com.example.foyer_amani_chamakh.DAO.Entities.Etudi;
import com.example.foyer_amani_chamakh.DAO.Entities.Reservation;
import com.example.foyer_amani_chamakh.DAO.Entities.University;
import com.example.foyer_amani_chamakh.DAO.Repository.UniversityRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class UniversityServices implements IUniversityServices {
@Autowired
UniversityRepo ur;

    @Override
    public University addUniv(University b) {
        return ur.save(b);
    }

    @Override
    public List<University> addallUni(List<University> lres) {
        return ur.saveAll(lres);
    }

    @Override
    public University updateUni(University b) {
        return ur.save(b);
    }

    @Override
    public List<University> updatealluni(List<University> lres) {
        return ur.saveAll(lres);
    }

    @Override
    public List<University> findalluni() {
        return ur.findAll();
    }

    @Override
    public University findUniById(Long  idUniversity) {
        return ur.findById(idUniversity).orElse(University.builder().idUniversity(0L).nomUniversity("bloc bizarre").build());
    }

    @Override
    public void deleteUni(University b) {
        ur.delete(b);

    }

    @Override
    public void deleteUniById(Long idUniv) {
     ur.deleteById(idUniv);
    }
}
