package tn.esprit.tpfoyer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Foyer;
import tn.esprit.tpfoyer.Service.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/Foyer")
public class FoyerController {

    @Autowired
    IFoyerService foyerService;

    // http://localhost:8089/tpFoyer/Foyer/addFoyer
    @PostMapping("/addFoyer")
    Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    // http://localhost:8089/tpFoyer/Foyer/updateFoyer
    @PutMapping("/updateFoyer")
    Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }

    //PathVariable khater kad tu insere fil id ili houwa cle primaire la manipulation du cle primaire de preference tssir pathvariable
    // http://localhost:8089/tpFoyer/Foyer/deleteFoyer/1
    @DeleteMapping("/deleteFoyer/{idFoyer}")
    void deleteFoyer(@PathVariable long idFoyer) {
        foyerService.deleteFoyer(idFoyer);
    }

    // http://localhost:8089/tpFoyer/Foyer/getFoyers
    @GetMapping("/getFoyers")
    public List<Foyer> getAllFoyers() {
        List<Foyer> foyersList = foyerService.retriveAllFoyer();
        return foyersList;
    }

    // http://localhost:8089/tpFoyer/Foyer/display/1

    @GetMapping("/display/{id}")
    public Foyer retrieveFoyer(@PathVariable("id") long id)
    {
        Foyer foyer = foyerService.retriveFoyer(id);
        return foyer;
    }

}
