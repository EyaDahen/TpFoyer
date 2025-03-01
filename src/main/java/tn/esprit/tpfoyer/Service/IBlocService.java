package tn.esprit.tpfoyer.Service;


import tn.esprit.tpfoyer.Entity.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc) ;
    Bloc updateBloc(Bloc bloc);
    void deleteBloc(Long idBloc);
    List<Bloc> retriveAllBlocs();
    Bloc retriveBloc(Long idBloc);
}
