package tn.esprit.tpfoyer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Bloc;
import tn.esprit.tpfoyer.Entity.Chambre;
import tn.esprit.tpfoyer.Service.IBlocService;
import tn.esprit.tpfoyer.Service.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/Bloc")
public class BlocController {
    @Autowired
    IBlocService blocService;

    // http://localhost:8089/tpFoyer/Bloc/addBloc
    @PostMapping("/addBloc")
    Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }
    // http://localhost:8089/tpFoyer/Bloc/updateBloc
    @PutMapping("/updateBloc")
    Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

    // http://localhost:8089/tpFoyer/Bloc/deleteBloc/1
    @DeleteMapping("/deleteBloc/{idbloc}")
    void deleteBloc(@PathVariable long idbloc) {
        blocService.deleteBloc(idbloc);
    }

    // http://localhost:8089/tpFoyer/Bloc/getBlocs
    @GetMapping("/getBlocs")
    public List<Bloc> retrieveAllBlocs() {
        return blocService.retriveAllBlocs();
    }
    // http://localhost:8089/tpFoyer/Bloc/display/1
    @GetMapping("/display/{id}")
    private Bloc retriveBloc(@PathVariable ("id")long id) {
        Bloc bloc = blocService.retriveBloc((long) id);
        return bloc ;
    }
}
