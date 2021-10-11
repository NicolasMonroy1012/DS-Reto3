package com.usa.G22.Reto3.web;

import com.usa.G22.Reto3.entities.Category;
import com.usa.G22.Reto3.entities.Message;
import com.usa.G22.Reto3.services.MessageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Message")
public class MessageWeb {
    @Autowired
    private MessageServices services;
    @GetMapping("/all")
    public List<Message> getMessage(){
        return services.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Message> getMessage(@PathVariable("id") int idMessage){
        return services.getMessage(idMessage);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message message){
        return services.save(message);
    }
}
