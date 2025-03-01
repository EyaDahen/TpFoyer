package tn.esprit.tpfoyer.Service;

import tn.esprit.tpfoyer.Entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant) ;
    Etudiant updateEtudiant(Etudiant etudiant);
    void deleteEtudiant(Long idEtudiant);
    List<Etudiant> retriveAllEtudiants();
    Etudiant retriveEtudiant(Long idEtudiant);
}
