/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.G22.Reto3.web;


import java.util.List;
import java.util.Optional;

import com.usa.G22.Reto3.entities.Category;
import com.usa.G22.Reto3.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/Category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    
    @GetMapping("/all")
    public List<Category> getCategorys(){
        return categoryService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Category> getCategory(@PathVariable("id") int categoryId){
        return categoryService.getCategory(categoryId);
    }
    
    @PostMapping("/save")
    public Category save(@RequestBody Category category){
        return categoryService.save(category);
    }
    
    @PutMapping("/update")
    public Category update(@RequestBody Category category){
        return categoryService.update(category);
    }
    
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int carId){
        return categoryService.deleteCategory(carId);
    }
}
