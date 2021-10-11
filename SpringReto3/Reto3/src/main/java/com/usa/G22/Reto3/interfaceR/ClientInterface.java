package com.usa.G22.Reto3.interfaceR;

import com.usa.G22.Reto3.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientInterface extends CrudRepository<Client,Integer> {
}
