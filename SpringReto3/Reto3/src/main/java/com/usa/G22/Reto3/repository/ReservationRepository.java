package com.usa.G22.Reto3.repository;

import com.usa.G22.Reto3.entities.Reservation;
import com.usa.G22.Reto3.interfaceR.ReservationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {
    @Autowired
    private ReservationInterface crud;

    public List<Reservation> getAll(){
        return (List<Reservation>) crud.findAll();
    }

    public Optional<Reservation> getReservation(int id){
        return  crud.findById(id);
    }

    public Reservation save(Reservation reservation){
        return crud.save(reservation);
    }
}
