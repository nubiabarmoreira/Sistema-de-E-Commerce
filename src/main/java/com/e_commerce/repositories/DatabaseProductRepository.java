package com.e_commerce.repositories;

import com.e_commerce.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DatabaseProductRepository extends JpaRepository<ProductModel, String> {
    Optional<ProductModel> findProductByName(String name);
}
