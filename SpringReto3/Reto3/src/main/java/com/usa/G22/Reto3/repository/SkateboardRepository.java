package com.usa.G22.Reto3.repository;

import com.usa.G22.Reto3.entities.Skateboard;
import com.usa.G22.Reto3.interfaceR.SkateboardInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SkateboardRepository {
    @Autowired
    private SkateboardInterface crud;

    public List<Skateboard> getAll(){
        return (List<Skateboard>) crud.findAll();
    }

    public Optional<Skateboard> getSkateboard(int id){
        return  crud.findById(id);
    }

    public Skateboard save(Skateboard skateboard){
        return crud.save(skateboard);
        }
    }

