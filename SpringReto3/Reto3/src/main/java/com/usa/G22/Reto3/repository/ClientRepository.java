package com.usa.G22.Reto3.repository;

import com.usa.G22.Reto3.entities.Client;
import com.usa.G22.Reto3.interfaceR.ClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {
    @Autowired
    private ClientInterface crud;

    public List<Client> getAll(){
        return (List<Client>) crud.findAll();
    }

    public Optional<Client> getClient(int id){
        return  crud.findById(id);
    }

    public Client save(Client client){
        return crud.save(client);
    }
}
