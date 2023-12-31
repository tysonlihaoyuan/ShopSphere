package com.shop.demo.Repo;

import com.shop.demo.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {
    @Query("select p from Product p where p.productName =?1")
    Optional<Product> findUserByProductName(String name);
}
