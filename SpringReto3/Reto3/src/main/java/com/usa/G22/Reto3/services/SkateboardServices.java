package com.usa.G22.Reto3.services;

import com.usa.G22.Reto3.entities.Skateboard;
import com.usa.G22.Reto3.repository.SkateboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkateboardServices {

    @Autowired
    private SkateboardRepository CrudMethods;
    public List<Skateboard> getAll(){
        return CrudMethods.getAll();
    }
    public Optional<Skateboard> getSkateboard(int idSkateboard){
        return CrudMethods.getSkateboard(idSkateboard);
    }
    public Skateboard save(Skateboard skateboard){
        if(skateboard.getIdSkateboard()==null){
            return CrudMethods.save(skateboard);
        }else{
            Optional<Skateboard>evt=CrudMethods.getSkateboard(skateboard.getIdSkateboard());
            if(evt.isEmpty()) {
            return CrudMethods.save(skateboard);
            }else{
                return skateboard;
            }
        }
    }
}
