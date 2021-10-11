package com.usa.G22.Reto3.web;

import com.usa.G22.Reto3.entities.Category;
import com.usa.G22.Reto3.entities.Client;
import com.usa.G22.Reto3.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Client")
public class ClientWeb {
    @Autowired
    private ClientServices services;
    @GetMapping("/all")
    public List<Client> getClient(){
        return services.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Client> getClient(@PathVariable("id") int idClient){
        return services.getClient(idClient);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client client){
        return services.save(client);
    }
}
