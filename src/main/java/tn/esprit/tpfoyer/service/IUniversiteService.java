package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite>  retrieveAllUniversites();
    Universite retrieveUniversite(long univsersiteId);
    Universite addUniversite(Universite u);
    void removeUniversite(long universiteId);
    Universite modifyUniversite(Universite universite);
}
