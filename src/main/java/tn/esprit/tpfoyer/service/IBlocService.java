package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc>  retrieveAllBlocs();
    Bloc retrieveBloc(long blocId);
    Bloc addBloc(Bloc b);
    void removeBloc(long blocId);
    Bloc modifyBloc(Bloc bloc);
}
