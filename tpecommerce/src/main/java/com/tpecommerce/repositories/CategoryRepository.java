package com.tpecommerce.repositories;


import com.tpecommerce.entities.Category;
import com.tpecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    public Category findByName(String nomc);
}
