package tn.esprit.tpfoyer.Service;


import tn.esprit.tpfoyer.Entity.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc) ;
    Bloc updateBloc(Bloc bloc);
    void deleteBloc(long idBloc);
    List<Bloc> retriveAllBlocs();
    Bloc retriveBloc(long idBloc);
}
