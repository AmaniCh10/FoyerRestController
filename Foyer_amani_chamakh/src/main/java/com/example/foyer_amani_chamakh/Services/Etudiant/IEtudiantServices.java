package com.example.foyer_amani_chamakh.Services.Etudiant;
import com.example.foyer_amani_chamakh.DAO.Entities.Etudi;

import java.util.List;

public interface IEtudiantServices {
    Etudi addEt(Etudi b);
    List<Etudi> addAllEt(List<Etudi> ets);
    Etudi updateEt(Etudi b);
    List<Etudi> updateAllEt(List<Etudi> blocs);
    List<Etudi> findAllEt();
    Etudi findEtById(long id);
    void deleteEt(Etudi b);
    void deleteEtById(long id);

}
