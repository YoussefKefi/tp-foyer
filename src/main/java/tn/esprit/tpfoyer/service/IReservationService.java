package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation>  retrieveAllReservations();
    Reservation retrieveReservation(long reservationId);
    Reservation addReservation(Reservation r);
    void removeReservation(long reservationId);
    Reservation modifyReservation(Reservation reservation);
}
