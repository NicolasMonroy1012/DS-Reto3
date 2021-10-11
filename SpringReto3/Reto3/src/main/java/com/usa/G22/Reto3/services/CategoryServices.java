package com.usa.G22.Reto3.services;

import com.usa.G22.Reto3.entities.Category;
import com.usa.G22.Reto3.entities.Skateboard;
import com.usa.G22.Reto3.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {
    @Autowired
    private CategoryRepository CrudMethods;
    public List<Category> getAll(){
        return CrudMethods.getAll();
    }
    public Optional<Category> getCategory(int idCategory){
        return CrudMethods.getCategory(idCategory);
    }
    public Category save(Category category){
        if(category.getIdCategory()==null){
            return CrudMethods.save(category);
        }else{
            Optional<Category>evt=CrudMethods.getCategory(category.getIdCategory());
            if(evt.isEmpty()) {
                return CrudMethods.save(category);
            }else{
                return category;
            }
        }
    }
}
