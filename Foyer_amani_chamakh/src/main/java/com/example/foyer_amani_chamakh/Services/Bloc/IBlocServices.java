package com.example.foyer_amani_chamakh.Services.Bloc;


import com.example.foyer_amani_chamakh.DAO.Entities.Bloc;
import com.example.foyer_amani_chamakh.DAO.Entities.Etudi;

import java.util.List;

public interface IBlocServices {
    Bloc addBloc(Bloc b);
    List<Bloc> addAllBlocs(List<Bloc> blocs);
    Bloc updateBloc(Bloc b);
    List<Bloc> updateAllBlocs(List<Bloc> blocs);
    List<Bloc> findAllBlocs();
    Bloc findBlocById(long id);
    void deleteBloc(Bloc b);
    void deleteBlocById(long id);


}
