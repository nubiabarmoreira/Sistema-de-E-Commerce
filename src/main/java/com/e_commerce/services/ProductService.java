package com.e_commerce.services;

import com.e_commerce.dtos.ProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO createProduct(String name, Double price, int quantity);
    List<ProductDTO> findAllProducts();
}
