package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.repository.BlocRepository;
import tn.esprit.tpfoyer.repository.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {
    @Autowired
    BlocRepository blocRepository;
    private FoyerRepository foyerRepository;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retrieveBloc(long blocId) {
        return blocRepository.findById(blocId).get();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public void removeBloc(long blocId) {
        blocRepository.deleteById(blocId);
    }

    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    // 1. Créer un Bloc et son Foyer en même temps
    @Override
    public Bloc addBlocAndFoyerAndAssign(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    // 2. Affecter un Bloc à un Foyer (Les deux sont déjà dans la base de données)
    @Override
    public void assignBlocToFoyer(Long blocId, Long foyerId) {
        Bloc bloc = blocRepository.findById(blocId).orElse(null);
        Foyer foyer = foyerRepository.findById(foyerId).orElse(null);

        if (bloc != null && foyer != null) {
            bloc.setFoyer(foyer);
            foyer.getBlocs().add(bloc);
            blocRepository.save(bloc);
        }
    }

    // 3. Désaffecter un Bloc de son Foyer
    @Override
    public void desaffecterBlocFromFoyer(Long blocId) {
        Bloc bloc = blocRepository.findById(blocId).orElse(null);

        if (bloc != null && bloc.getFoyer() != null) {
            Foyer foyer = bloc.getFoyer();
            foyer.getBlocs().remove(bloc);
            bloc.setFoyer(null);
            blocRepository.save(bloc);
        }
    }
}
