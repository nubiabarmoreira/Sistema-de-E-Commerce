package com.e_commerce.repositories;

import com.e_commerce.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatabaseProductRepository extends JpaRepository<ProductModel, String> {
}
