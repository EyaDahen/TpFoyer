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

    // http://localhost:8089/tpFoyer/Chambre/addChambre
    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    // http://localhost:8089/tpFoyer/Chambre/updateChambre
    @PutMapping("/updateChambre")
    Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }

    //PathVariable khater kad tu insere fil id ili houwa cle primaire la manipulation du cle primaire de preference tssir pathvariable
    // http://localhost:8089/tpFoyer/Chambre/deleteChambre/1
    @DeleteMapping("/deleteChambre/{idChambre}")
    void deleteChambre(@PathVariable long idChambre) {
        chambreService.deleteChambre(idChambre);
    }

    // http://localhost:8089/tpFoyer/Chambre/getChambres
    @GetMapping("/getChambres")
    public List<Chambre> getAllChambres() {
        List<Chambre> chambreList = chambreService.retriveAllChambre();
        return chambreList;
    }

    // http://localhost:8089/tpFoyer/Chambre/display/1

    @GetMapping("/display/{id}")
    public Chambre retrieveChambre(@PathVariable("id") long id)
    {
        Chambre chambre = chambreService.retriveChambre(id);
        return chambre;
    }

}
