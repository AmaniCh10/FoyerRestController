package com.example.foyer_amani_chamakh.Services.University;

import com.example.foyer_amani_chamakh.DAO.Entities.Reservation;
import com.example.foyer_amani_chamakh.DAO.Entities.University;

import java.util.List;

public interface IUniversityServices {
    University addUniv(University b);
    List<University> addallUni(List<University> lres);

    University updateUni(University b);

    List<University> updatealluni(List<University> lres);
    List<University> findalluni();
    University findUniById(Long idReservation);
    void deleteUni(University b);
    void deleteUniById(Long idReservation);
}
