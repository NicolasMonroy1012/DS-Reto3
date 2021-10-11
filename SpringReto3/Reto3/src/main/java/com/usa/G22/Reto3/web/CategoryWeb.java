package com.usa.G22.Reto3.web;

import com.usa.G22.Reto3.entities.Category;
import com.usa.G22.Reto3.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Category")
public class CategoryWeb {
    @Autowired
    private CategoryServices services;
    @GetMapping("/all")
    public List<Category> getCategory(){
        return services.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Category> getCategory(@PathVariable("id") int idCategory){
        return services.getCategory(idCategory);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category category){
        return services.save(category);
    }
}
