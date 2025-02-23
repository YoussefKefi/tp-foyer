package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer>  retrieveAllFoyers();
    Foyer retrieveFoyer(long foyerId);
    Foyer addFoyer(Foyer f);
    void removeFoyer(long foyerId);
    Foyer modifyFoyer(Foyer foyer);
}
