package tn.esprit.tpfoyer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Reservation;
import tn.esprit.tpfoyer.Entity.Universite;
import tn.esprit.tpfoyer.Service.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/Universite")
public class UniversiteController {

    @Autowired
    IUniversiteService universiteService;

    // http://localhost:8089/tpFoyer/Universite/addUniversite
    @PostMapping("/addUniversite")
    Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    // http://localhost:8089/tpFoyer/Universite/updateUniversite
    @PutMapping("/updateUniversite")
    Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    //PathVariable khater kad tu insere fil id ili houwa cle primaire la manipulation du cle primaire de preference tssir pathvariable
    // http://localhost:8089/tpFoyer/Universite/deleteUniversite/1
    @DeleteMapping("/deleteUniversite/{idUniversite}")
    void deleteUniversite(@PathVariable long idUniversite) {
        universiteService.deleteUniversite(idUniversite);
    }

    // http://localhost:8089/tpFoyer/Universite/getUniversites
    @GetMapping("/getUniversites")
    public List<Universite> getAllUniversites() {
        List<Universite> universiteList = universiteService.retriveAllUniversites();
        return universiteList;
    }

    // http://localhost:8089/tpFoyer/Universite/display/1

    @GetMapping("/display/{id}")
    public Universite retrieveUniversite(@PathVariable("id") long id)
    {
        Universite universite = universiteService.retriveUniversite(id);
        return universite;
    }


}
