package tn.esprit.tpfoyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entity.Foyer;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImplement implements IFoyerService{
    @Override
    public Foyer addFoyer(Foyer foyer) {
        return null;
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return null;
    }

    @Override
    public void deleteFoyer(Long idFoyer) {

    }

    @Override
    public List<Foyer> retriveAllFoyer() {
        return List.of();
    }

    @Override
    public Foyer retriveFoyer(Long idFoyer) {
        return null;
    }
}
