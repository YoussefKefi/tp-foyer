package tn.esprit.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.service.IEtudiantService;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {
    @Autowired
    IEtudiantService etudiantService;

    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }

    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long etId) {
        return etudiantService.retrieveEtudiant(etId);
    }

    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long etId) {
        etudiantService.removeEtudiant(etId);
    }

    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(Etudiant e) {
        return etudiantService.modifyEtudiant(e);
    }

    @GetMapping("/find-etudiants-by-ecole-and-date-naissance/{nomE}/{datenai}")
    public List<Etudiant> findEtudiantsByEcoleAndDateNaissanceGreaterThan(@PathVariable("nomE") String nomE,
                                                                          @PathVariable @DateTimeFormat(fallbackPatterns = "yyyy-MM-dd") Date datenai) {
        return etudiantService.findEtudiantsByEcoleAndDateNaissanceGreaterThan(nomE, datenai);
    }

}
