package com.usa.G22.Reto3.web;

import com.usa.G22.Reto3.entities.Skateboard;
import com.usa.G22.Reto3.services.SkateboardServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Skateboard")
public class SkateboardWeb {
    @GetMapping("/holamundo")
    public String saludar(){
        return("Hola Mundo Tutoriassss");
    }
    @Autowired
    private SkateboardServices services;
    @GetMapping("/all")
    public List<Skateboard> getSkateboard(){
        return services.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Skateboard> getSkateboard(@PathVariable("id") int idSkateboard){
        return services.getSkateboard(idSkateboard);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Skateboard save(@RequestBody Skateboard skateboard){
        return services.save(skateboard);
    }
}
