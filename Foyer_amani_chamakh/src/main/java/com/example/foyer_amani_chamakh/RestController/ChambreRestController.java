package com.example.foyer_amani_chamakh.RestController;

import com.example.foyer_amani_chamakh.DAO.Entities.Chambre;
import com.example.foyer_amani_chamakh.Services.Chambre.IChambreServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ChambreRestController {
    IChambreServices IChamSer;
    @GetMapping("getALL")
    public List<Chambre> getAll(){
        return IChamSer.findAllChambre();

    }
    @PostMapping("add")
    public Chambre addBloc(@RequestBody Chambre b){
        return IChamSer.addChambre(b);
    }

    @GetMapping("getById")
    public Chambre getById(@RequestParam Long id ){
        return IChamSer.findChambrebyId(id);
    }
    /*  @GetMapping("getById/{id}")
    public Bloc getById(@PathVariable Long id ){
        return iblocSer.findBlocById(id);
    }*/


    @DeleteMapping("delete")
    public void deleteChambre(@RequestParam Chambre b){
        IChamSer.deleteChambre(b);
        System.out.println("bloc deleted ");
    }
}
