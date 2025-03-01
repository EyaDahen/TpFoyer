package tn.esprit.tpfoyer.Service;

import tn.esprit.tpfoyer.Entity.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer) ;
    Foyer updateFoyer(Foyer foyer);
    void deleteFoyer(Long idFoyer);
    List<Foyer> retriveAllFoyer();
    Foyer retriveFoyer(Long idFoyer);
}
