/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.cctv.c3r3.controller;


import java.util.List;
import java.util.Optional;

import com.usa.G22.Reto3.entities.Reservation;
import com.usa.G22.Reto3.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/Reservation")
public class RervationController {
    @Autowired
    private ReservationService reservationService;
    
    @GetMapping("/all")
    public List<Reservation> getReservations(){
        return reservationService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Reservation> getReservation(@PathVariable("idReservation") int Id){
        return reservationService.getReservation(Id);
    }
    
    @PostMapping("/save")
    public Reservation save(@RequestBody Reservation reservation){
        return reservationService.save(reservation);
    }
    
    @PutMapping("/update")
    public Reservation update(@RequestBody Reservation reservation){
        return reservationService.update(reservation);
    }
    
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int Id){
        return reservationService.deleteReservation(Id);
    }
}
