package com.e_commerce.services;

import com.e_commerce.dtos.ProductDTO;

public interface ProductService {
    ProductDTO createProduct(String name, Double price, int quantity);
}
