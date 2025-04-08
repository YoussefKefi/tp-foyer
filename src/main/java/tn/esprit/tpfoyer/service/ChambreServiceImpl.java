package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.entity.TypeChambre;
import tn.esprit.tpfoyer.repository.ChambreRepository;

import java.util.List;
@RequiredArgsConstructor
@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {
    @Autowired
    ChambreRepository chambreRepository;

    public List<Chambre>  retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retrieveChambre(long chambreId) {
        return chambreRepository.findById(chambreId).get();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public void removeChambre(long chambreId) {
        chambreRepository.deleteById(chambreId);
    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    //Keywords
    @Override
    public List<Chambre> trouverChambreParType (TypeChambre tch){
        return chambreRepository.findAllBytypeC(tch);
    }
    @Override
    public Chambre findChambreByNumeroChambre (long numC){
        return chambreRepository.findChambreByNumeroChambre(numC);
    }
    @Override
    public Chambre trouverChselonEt (long cin){
        return chambreRepository.trouverChselonEt(cin);
    }
}
