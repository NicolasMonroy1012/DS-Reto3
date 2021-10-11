package com.usa.G22.Reto3.interfaceR;

import com.usa.G22.Reto3.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationInterface extends CrudRepository<Reservation,Integer> {
}
