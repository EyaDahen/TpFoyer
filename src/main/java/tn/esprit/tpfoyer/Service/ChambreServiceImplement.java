package tn.esprit.tpfoyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entity.Chambre;
import tn.esprit.tpfoyer.Repository.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImplement implements IChambreService {
    @Autowired
    private ChambreRepository chambreRepository;


    @Override
    public Chambre addChambre(Chambre chambre) {

        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {

        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Long idchambre) {
        chambreRepository.deleteById(idchambre);
    }

    @Override
    public List<Chambre> retriveAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retriveChambre(Long idchambre) {
        return chambreRepository.findById(idchambre).get();
    }
}
