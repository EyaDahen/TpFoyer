package tn.esprit.tpfoyer.Service;

import tn.esprit.tpfoyer.Entity.Chambre;

import java.util.List;
import java.util.Set;

public interface IChambreService {

    Chambre addChambre(Chambre chambre) ;
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(Long idchambre);
    List<Chambre> retriveAllChambre();
    Chambre retriveChambre(Long idchambre);

}
