package tn.esprit.tpfoyer.Service;

import tn.esprit.tpfoyer.Entity.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation) ;
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(String idReservation);
    List<Reservation> retriveAllReservations();
    Reservation retriveReservation(String idReservation);
}
