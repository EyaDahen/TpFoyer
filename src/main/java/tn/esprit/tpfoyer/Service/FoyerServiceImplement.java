package tn.esprit.tpfoyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entity.Foyer;
import tn.esprit.tpfoyer.Repository.EtudiantRepository;
import tn.esprit.tpfoyer.Repository.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImplement implements IFoyerService{

    @Autowired
    private FoyerRepository foyerRepository;

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

    @Override
    public List<Foyer> retriveAllFoyer() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer retriveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }
}
