package tn.esprit.tpfoyer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Chambre;
import tn.esprit.tpfoyer.Service.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/Chambre")
public class ChambreController {
    @Autowired
    IChambreService chambreService;

    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @PutMapping("/updateChambre")
    Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }

    //PathVariable khater kad tu insere fil id ili houwa cle primaire la manipulation du cle primaire de preference tssir pathvariable
    @DeleteMapping("/deleteChambre/{idChambre}")
    void deleteChambre(@PathVariable long idChambre) {
        chambreService.deleteChambre(idChambre);
    }

    @GetMapping("/getChambres")
    public List<Chambre> getAllChambres() {
        return chambreService.retriveAllChambre();
    }

    @GetMapping("/display/{id}")
    private String displaySpecificChambre(@PathVariable("id") int id)
    {
        chambreService.retriveChambre((long) id);
        return "display mrigl";
    }

}
