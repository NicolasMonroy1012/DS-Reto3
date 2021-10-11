package com.usa.G22.Reto3.services;

import com.usa.G22.Reto3.entities.Category;
import com.usa.G22.Reto3.entities.Client;
import com.usa.G22.Reto3.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServices {
    @Autowired
    private ClientRepository CrudMethods;
    public List<Client> getAll(){
        return CrudMethods.getAll();
    }
    public Optional<Client> getClient(int idClient){
        return CrudMethods.getClient(idClient);
    }
    public Client save(Client client){
        if(client.getIdClient()==null){
            return CrudMethods.save(client);
        }else{
            Optional<Client>evt=CrudMethods.getClient(client.getIdClient());
            if(evt.isEmpty()) {
                return CrudMethods.save(client);
            }else{
                return client;
            }
        }
    }
}
