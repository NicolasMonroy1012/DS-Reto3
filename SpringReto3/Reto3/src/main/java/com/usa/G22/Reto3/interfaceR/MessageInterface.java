package com.usa.G22.Reto3.interfaceR;

import com.usa.G22.Reto3.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageInterface extends CrudRepository<Message,Integer> {
}
