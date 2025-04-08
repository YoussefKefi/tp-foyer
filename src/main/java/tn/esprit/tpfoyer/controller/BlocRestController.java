package tn.esprit.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.service.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {
    @Autowired
    IBlocService blocService;

    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        return blocService.retrieveAllBlocs();
    }

    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long bId) {
        return blocService.retrieveBloc(bId);
    }

    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        return blocService.addBloc(b);
    }

    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long bId) {
        blocService.removeBloc(bId);
    }

    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc b) {
        return blocService.modifyBloc(b);
    }
    // 1. Créer un Bloc et son Foyer en même temps
    @PostMapping("/add-bloc-and-foyer")
    public Bloc addBlocAndFoyer(@RequestBody Bloc bloc) {
        return blocService.addBlocAndFoyerAndAssign(bloc);
    }

    // 2. Affecter un Bloc à un Foyer (Les deux sont déjà dans la base de données)
    @PutMapping("/assign-bloc-to-foyer/{blocId}/{foyerId}")
    public void assignBlocToFoyer(@PathVariable Long blocId, @PathVariable Long foyerId) {
        blocService.assignBlocToFoyer(blocId, foyerId);
    }

    // 3. Désaffecter un Bloc de son Foyer
    @PutMapping("/desaffecter-bloc-from-foyer/{blocId}")
    public void desaffecterBlocFromFoyer(@PathVariable Long blocId) {
        blocService.desaffecterBlocFromFoyer(blocId);
    }
}
