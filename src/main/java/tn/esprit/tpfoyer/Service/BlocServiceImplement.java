package tn.esprit.tpfoyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entity.Bloc;
import tn.esprit.tpfoyer.Repository.BlocRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImplement implements IBlocService {

    @Autowired
    private BlocRepository blocRepository;


    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);

    }

    @Override
    public List<Bloc> retriveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retriveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }
}
