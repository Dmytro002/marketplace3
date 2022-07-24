package com.example.marketplace3.repositories;


import com.example.marketplace3.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {


    @Query(value="select p.* from product p inner join buyer b on b.id = p.userId", nativeQuery=true)
    public List<Product> userProducts(int id);
}
