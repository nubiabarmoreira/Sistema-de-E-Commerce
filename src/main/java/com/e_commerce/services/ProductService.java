package com.e_commerce.services;

import com.e_commerce.dtos.ProductDTO;
import com.e_commerce.dtos.ProductRequestDTO;

import java.util.List;

public interface ProductService {
    ProductDTO createProduct(String name, Double price, int quantity);
    List<ProductDTO> findAllProducts();
    ProductDTO findProductByName(ProductRequestDTO productRequestDTO);
}
