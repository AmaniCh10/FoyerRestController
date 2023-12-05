package com.example.foyer_amani_chamakh.RestController;

import com.example.foyer_amani_chamakh.DAO.Entities.Bloc;
import com.example.foyer_amani_chamakh.Services.Bloc.IBlocServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocRestController {
    IBlocServices iblocSer;
    @GetMapping("getALL")
    public List<Bloc> getAll(){
        return iblocSer.findAllBlocs();

    }
    @PostMapping("addBloc")
    public Bloc addBloc(@RequestBody Bloc b){
        return iblocSer.addBloc(b);
    }

    @GetMapping("getById")
    public Bloc getById(@RequestParam Long id ){
        return iblocSer.findBlocById(id);
    }
    /*  @GetMapping("getById/{id}")
    public Bloc getById(@PathVariable Long id ){
        return iblocSer.findBlocById(id);
    }*/


    @DeleteMapping("delete")
    public void deleteBloc(@RequestParam Bloc b){
        iblocSer.deleteBloc(b);
        System.out.println("bloc deleted ");
    }

}
