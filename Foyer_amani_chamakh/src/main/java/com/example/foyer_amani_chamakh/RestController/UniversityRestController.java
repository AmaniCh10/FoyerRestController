package com.example.foyer_amani_chamakh.RestController;

import com.example.foyer_amani_chamakh.DAO.Entities.Chambre;
import com.example.foyer_amani_chamakh.DAO.Entities.University;
import com.example.foyer_amani_chamakh.Services.University.IUniversityServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UniversityRestController {
    IUniversityServices UnivSER;
    @GetMapping("getALLUniversity")
    public List<University> getAll(){
        return UnivSER.findalluni();
    }
    @PostMapping("addUniversity")
    public University addUniv(@RequestBody University b){
        return UnivSER.addUniv(b);
    }

    @GetMapping("getUniversityById")
    public University getById(@RequestParam Long id ){
        return UnivSER.findUniById(id);
    }
    /*  @GetMapping("getById/{id}")
    public Bloc getById(@PathVariable Long id ){
        return iblocSer.findBlocById(id);
    }*/


    @DeleteMapping("deleteUniversity")
    public void deleteUniv(@RequestParam University b){
        UnivSER.deleteUni(b);
        System.out.println("bloc deleted ");
    }
}
