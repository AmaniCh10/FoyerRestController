package com.example.foyer_amani_chamakh.Services.Bloc;

import com.example.foyer_amani_chamakh.DAO.Entities.Bloc;
import com.example.foyer_amani_chamakh.DAO.Repository.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//definir que c'est un bean spring
@AllArgsConstructor
public class BlocServices implements IBlocServices{

    @Autowired
    BlocRepository blocRepo;

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepo.save(b);
    }

    @Override
    public List<Bloc> addAllBlocs(List<Bloc> blocs) {
        return  blocRepo.saveAll(blocs);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepo.save(b)  ;
    }

    @Override
    public List<Bloc> updateAllBlocs(List<Bloc> blocs) {
        return blocRepo.saveAll(blocs)  ;    }

    @Override
    public List<Bloc> findAllBlocs() {
        return blocRepo.findAll();
    }

    @Override
    public Bloc findBlocById(long id) {
        //optional<bloc>:retour de null(null pointer exception)
        //résoudre le problème : .get() ou OrElse()
        //.get() retourne un resultat si elle a trouvé un eligne avec l'id passé en paramétre
       //si non retourne un objet vide
        //return blocRepo.findById(id).get();
        //orElse() retourne un resultat si elle a trouvé un eligne avec l'id passé en paramétre
        // si non orElse(....) : definir l'objet de retour au cas ou la base de données ne retourne pas une ligne avec l'id passé en paramétre
        return blocRepo.findById(id).orElse(Bloc.builder().idbloc(0L).nombloc("bloc bizarre").build());
    }


    @Override
    public void deleteBloc(Bloc b) {
        blocRepo.delete(b);

    }

    @Override
    public void deleteBlocById(long id) {
        blocRepo.deleteById(id);

    }
}
