package com.usa.G22.Reto3.interfaceR;

import com.usa.G22.Reto3.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryInterface extends CrudRepository<Category, Integer> {
}
