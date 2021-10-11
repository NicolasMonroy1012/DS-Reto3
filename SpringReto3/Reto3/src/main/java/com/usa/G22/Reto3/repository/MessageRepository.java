package com.usa.G22.Reto3.repository;

import com.usa.G22.Reto3.entities.Client;
import com.usa.G22.Reto3.entities.Message;
import com.usa.G22.Reto3.interfaceR.MessageInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {
    @Autowired
    private MessageInterface crud;

    public List<Message> getAll(){
        return (List<Message>) crud.findAll();
    }

    public Optional<Message> getMessage(int id){
        return  crud.findById(id);
    }

    public Message save(Message message){
        return crud.save(message);
    }
}
