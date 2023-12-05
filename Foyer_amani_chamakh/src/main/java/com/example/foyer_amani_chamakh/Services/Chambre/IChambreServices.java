package com.example.foyer_amani_chamakh.Services.Chambre;

import com.example.foyer_amani_chamakh.DAO.Entities.Bloc;
import com.example.foyer_amani_chamakh.DAO.Entities.Chambre;

import java.util.List;

public interface IChambreServices {

    Chambre addChambre(Chambre b);
    List<Chambre> addallChambre(List<Chambre> b);
    Chambre updateChambre(Chambre b);
    List<Chambre> updateallChambre(List<Chambre> b);
    List<Chambre> findAllChambre();
    Chambre findChambrebyId(long id);
    void deleteChambre(Chambre b);
    void deletebyChambre(long id);
}
