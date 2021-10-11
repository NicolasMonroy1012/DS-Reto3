package com.usa.G22.Reto3.web;


import com.usa.G22.Reto3.entities.Reservation;
import com.usa.G22.Reto3.services.ReservationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationWeb {
    @Autowired
    private ReservationServices services;
    @GetMapping("/all")
    public List<Reservation> getReservation(){
        return services.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Reservation> getCategory(@PathVariable("id") int idReservation){
        return services.getReservation(idReservation);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation reservation){
        return services.save(reservation);
    }
}
