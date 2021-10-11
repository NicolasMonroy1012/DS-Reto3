package com.usa.G22.Reto3.services;

import com.usa.G22.Reto3.entities.Category;
import com.usa.G22.Reto3.entities.Message;
import com.usa.G22.Reto3.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageServices {
    @Autowired
    private MessageRepository CrudMethods;
    public List<Message> getAll(){
        return CrudMethods.getAll();
    }
    public Optional<Message> getMessage(int idMessage){
        return CrudMethods.getMessage(idMessage);
    }
    public Message save(Message message){
        if(message.getIdMessage()==null){
            return CrudMethods.save(message);
        }else{
            Optional<Message>evt=CrudMethods.getMessage(message.getIdMessage());
            if(evt.isEmpty()) {
                return CrudMethods.save(message);
            }else{
                return message;
            }
        }
    }
}
