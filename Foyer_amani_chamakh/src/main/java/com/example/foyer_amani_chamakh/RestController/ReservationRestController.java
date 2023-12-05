package com.example.foyer_amani_chamakh.RestController;

import com.example.foyer_amani_chamakh.DAO.Entities.Bloc;
import com.example.foyer_amani_chamakh.DAO.Entities.Reservation;
import com.example.foyer_amani_chamakh.Services.Bloc.IBlocServices;
import com.example.foyer_amani_chamakh.Services.Reservation.IReservationServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ReservationRestController {
    IReservationServices iresSer;
    @GetMapping("getALL")
    public List<Reservation> getAll(){
        return iresSer.findallres();

    }
    @PostMapping("addBloc")
    public Reservation add(@RequestBody Reservation b){
        return iresSer.addRes(b);
    }

    @GetMapping("getById")
    public Reservation getById(@RequestParam String id ){
        return iresSer.findresById(id);
    }
    /*  @GetMapping("getById/{id}")
    public Bloc getById(@PathVariable Long id ){
        return iblocSer.findBlocById(id);
    }*/


    @DeleteMapping("delete")
    public void DELETErESERVATION(@RequestParam Reservation b){
        iresSer.deleteres(b);
        System.out.println("res deleted ");
    }
}
