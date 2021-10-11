package com.usa.G22.Reto3.services;

import com.usa.G22.Reto3.entities.Category;
import com.usa.G22.Reto3.entities.Reservation;
import com.usa.G22.Reto3.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServices {
    @Autowired
    private ReservationRepository CrudMethods;
    public List<Reservation> getAll(){
        return CrudMethods.getAll();
    }
    public Optional<Reservation> getReservation(int idReservation){
        return CrudMethods.getReservation(idReservation);
    }
    public Reservation save(Reservation reservation){
        if(reservation.getIdReservation()==null){
            return CrudMethods.save(reservation);
        }else{
            Optional<Reservation>evt=CrudMethods.getReservation(reservation.getIdReservation());
            if(evt.isEmpty()) {
                return CrudMethods.save(reservation);
            }else{
                return reservation;
            }
        }
    }
}
