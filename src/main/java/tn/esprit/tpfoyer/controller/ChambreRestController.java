package tn.esprit.tpfoyer.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.entity.TypeChambre;
import tn.esprit.tpfoyer.service.IChambreService;

import java.util.List;
@RequiredArgsConstructor
@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {
    @Autowired
    IChambreService chambreService;

    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        return chambreService.retrieveAllChambres();
    }

    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long chId) {
        return chambreService.retrieveChambre(chId);
    }

    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        return chambreService.addChambre(c);
    }

    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.removeChambre(chId);
    }

    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        return chambreService.modifyChambre(c);
    }
    @GetMapping("/find-chambre-by-type/{type-chambre}")
    public List<Chambre> findChambreByType(@PathVariable("type-chambre")
                                               TypeChambre tch) {
        return chambreService.trouverChambreParType(tch);
    }
    @GetMapping("/find-chambre-by-numero/{numero-chambre}")
    public Chambre findChambreByNumeroChambre(@PathVariable("numero-chambre")
                                                  Long numC) {
        return chambreService.findChambreByNumeroChambre(numC);
    }

    @GetMapping("/find-chambre-selon-et/{cin}")
    public Chambre trouverChselonEt(@PathVariable("cin") Long cin) {
        return chambreService.trouverChselonEt(cin);}
}
