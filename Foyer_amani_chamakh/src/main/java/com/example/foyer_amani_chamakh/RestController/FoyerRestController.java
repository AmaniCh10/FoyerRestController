package com.example.foyer_amani_chamakh.RestController;

import com.example.foyer_amani_chamakh.DAO.Entities.Bloc;
import com.example.foyer_amani_chamakh.DAO.Entities.Foyer;
import com.example.foyer_amani_chamakh.Services.Foyer.IFoyerServices;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
public class FoyerRestController {
    IFoyerServices Fser;

    @GetMapping("getALLfoyers")
    public List<Foyer> getAllFoyer(){
        return Fser.findAllFoyer();

    }
    @PostMapping("addfoyer")
    public Foyer addFoyer(@RequestBody Foyer b){
        return Fser.addFoyer(b);
    }

    @GetMapping("getFoyerById")
    public Foyer getById(@RequestParam Long id ){
        return Fser.findFoyerById(id);
    }
    /*  @GetMapping("getById/{id}")
    public Bloc getById(@PathVariable Long id ){
        return iblocSer.findBlocById(id);
    }*/


    @DeleteMapping("delete")
    public void DELETEfOYER(@RequestParam Foyer b){
        Fser.deleteFoyer(b);
        System.out.println("Foyer deleted ");
    }


}
