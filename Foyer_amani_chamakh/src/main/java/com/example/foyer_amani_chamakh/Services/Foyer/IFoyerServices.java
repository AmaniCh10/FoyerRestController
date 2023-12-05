package com.example.foyer_amani_chamakh.Services.Foyer;


import com.example.foyer_amani_chamakh.DAO.Entities.Foyer;

import java.util.List;

public interface IFoyerServices {
    Foyer addFoyer(Foyer b);
    List<Foyer> addAllFoyer(List<Foyer> ets);
    Foyer updateFoyer(Foyer b);
    List<Foyer> updateAllFoyer(List<Foyer> blocs);
    List<Foyer> findAllFoyer();
    Foyer findFoyerById(long id);
    void deleteFoyer(Foyer b);
    void deleteFoyerById(long id);
}
