package com.example.foyer_amani_chamakh.Services.Reservation;

import com.example.foyer_amani_chamakh.DAO.Entities.Foyer;
import com.example.foyer_amani_chamakh.DAO.Entities.Reservation;

import java.util.List;

public interface IReservationServices {
    Reservation addRes(Reservation b);
    List<Reservation> addallres(List<Reservation> lres);

    Reservation updateres(Reservation b);

    List<Reservation> updateallres(List<Reservation> lres);
    List<Reservation> findallres();
    Reservation findresById(String idReservation);
    void deleteres(Reservation b);
    void deleteresbyid(String idReservation);
}
