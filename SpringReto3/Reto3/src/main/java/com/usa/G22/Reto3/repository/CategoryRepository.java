package com.usa.G22.Reto3.repository;

import com.usa.G22.Reto3.entities.Category;
import com.usa.G22.Reto3.interfaceR.CategoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {
    @Autowired
    private CategoryInterface crud;

    public List<Category> getAll(){
        return (List<Category>) crud.findAll();
    }

    public Optional<Category> getCategory(int id){
        return  crud.findById(id);
    }

    public Category save(Category category){
        return crud.save(category);
    }
}
