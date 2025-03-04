package tn.esprit.tpfoyer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Chambre;
import tn.esprit.tpfoyer.Entity.Etudiant;
import tn.esprit.tpfoyer.Service.IChambreService;
import tn.esprit.tpfoyer.Service.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/Etudiant")
public class EtudiantController {

    @Autowired
    IEtudiantService etudiantService;

    // http://localhost:8089/tpFoyer/Etudiant/addEtudiant
    @PostMapping("/addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }

    // http://localhost:8089/tpFoyer/Etudiant/updateEtudiant
    @PutMapping("/updateEtudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }

    //PathVariable khater kad tu insere fil id ili houwa cle primaire la manipulation du cle primaire de preference tssir pathvariable
    // http://localhost:8089/tpFoyer/Etudiant/deleteEtudiant/1
    @DeleteMapping("/deleteEtudiant/{idEtudiant}")
    void deleteEtudiant(@PathVariable long idEtudiant) {
        etudiantService.deleteEtudiant(idEtudiant);
    }

    // http://localhost:8089/tpFoyer/Etudiant/getEtudiants
    @GetMapping("/getEtudiants")
    public List<Etudiant> getAllEtudiants() {
        List<Etudiant> etudiantList = etudiantService.retriveAllEtudiants();
        return etudiantList;
    }

    // http://localhost:8089/tpFoyer/Etudiant/display/1

    @GetMapping("/display/{id}")
    public Etudiant retrieveEtudiant(@PathVariable("id") long id)
    {
        Etudiant etudiant = etudiantService.retriveEtudiant(id);
        return etudiant;
    }

}
