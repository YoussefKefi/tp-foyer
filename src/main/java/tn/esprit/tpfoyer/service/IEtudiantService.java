package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Etudiant;

import java.util.Date;
import java.util.List;

public interface IEtudiantService {
    List<Etudiant>  retrieveAllEtudiants();
    Etudiant retrieveEtudiant (long etudiantId);
    Etudiant addEtudiant(Etudiant e);
    void removeEtudiant(long etudiantId);
    Etudiant modifyEtudiant(Etudiant etudiant);
    List<Etudiant> findEtudiantsByEcoleAndDateNaissanceGreaterThan(String nomE, Date datenai);
}
