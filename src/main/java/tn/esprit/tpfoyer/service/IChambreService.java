package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.entity.TypeChambre;

import java.util.List;

public interface IChambreService {

    List<Chambre>  retrieveAllChambres();
    Chambre retrieveChambre(long chambreId);
    Chambre addChambre(Chambre c);
    void removeChambre(long chambreId);
    Chambre modifyChambre(Chambre chambre);
    List<Chambre> trouverChambreParType(TypeChambre tch);
    Chambre findChambreByNumeroChambre(long numC);
    Chambre trouverChselonEt(long cin);
}
