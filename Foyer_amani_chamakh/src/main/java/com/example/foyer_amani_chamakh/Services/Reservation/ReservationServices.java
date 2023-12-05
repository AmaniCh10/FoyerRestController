package com.example.foyer_amani_chamakh.Services.Reservation;

import com.example.foyer_amani_chamakh.DAO.Entities.Reservation;
import com.example.foyer_amani_chamakh.DAO.Repository.ReservationRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class ReservationServices implements IReservationServices{
    @Autowired
    ReservationRepo RR;
    List<Reservation>listRes=new ArrayList<>();
    @Override
    public Reservation addRes(Reservation b) {
        return RR.save(b);
    }

    @Override
    public List<Reservation> addallres(List<Reservation> lres) {
        return RR.saveAll(lres);
    }

    @Override
    public Reservation updateres(Reservation b) {
        return RR.save(b)  ;
    }

    @Override
    public List<Reservation> updateallres(List<Reservation> lres) {
        return RR.saveAll(lres);
    }

    @Override
    public List<Reservation> findallres() {
        return null;
    }

    @Override
    public Reservation findresById(String idReservation) {
        return null;
    }

    @Override
    public void deleteres(Reservation b) {

    }

    @Override
    public void deleteresbyid(String idReservation) {

    }
}
