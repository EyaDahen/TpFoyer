package tn.esprit.tpfoyer.Controller;

import jdk.management.jfr.RemoteRecordingStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Foyer;
import tn.esprit.tpfoyer.Entity.Reservation;
import tn.esprit.tpfoyer.Service.IFoyerService;
import tn.esprit.tpfoyer.Service.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/Reservation")
public class ReservationController {

    @Autowired
    IReservationService reservationService;

    // http://localhost:8089/tpFoyer/Reservation/addReservation
    @PostMapping("/addReservation")
    Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    // http://localhost:8089/tpFoyer/Reservation/updateReservation
    @PutMapping("/updateReservation")
    Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    //PathVariable khater kad tu insere fil id ili houwa cle primaire la manipulation du cle primaire de preference tssir pathvariable
    // http://localhost:8089/tpFoyer/Reservation/deleteReservation/1
    @DeleteMapping("/deleteReservation/{idReservation}")
    void deleteReservation(@PathVariable String idReservation) {
        reservationService.deleteReservation(idReservation);
    }

    // http://localhost:8089/tpFoyer/Reservation/getReservations
    @GetMapping("/getReservations")
    public List<Reservation> getAllReservations() {
        List<Reservation> reservationList = reservationService.retriveAllReservations();
        return reservationList;
    }

    // http://localhost:8089/tpFoyer/Reservation/display/1

    @GetMapping("/display/{id}")
    public Reservation retrieveReservation(@PathVariable("id") String id)
    {
        Reservation reservation = reservationService.retriveReservation(id);
        return reservation;
    }

}
