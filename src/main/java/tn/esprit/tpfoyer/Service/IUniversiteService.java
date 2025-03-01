package tn.esprit.tpfoyer.Service;

import tn.esprit.tpfoyer.Entity.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite ) ;
    Universite updateUniversite(Universite universite);
    void deleteUniversite(long idUniversite);
    List<Universite> retriveAllUniversites();
    Universite retriveUniversite(Long idUniversite);
}
