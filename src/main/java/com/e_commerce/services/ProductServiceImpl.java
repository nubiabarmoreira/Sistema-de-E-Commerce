package com.e_commerce.services;

import com.e_commerce.dtos.ProductDTO;
import com.e_commerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductDTO createProduct(String name, Double price, int quantity) {
        ProductDTO productToCreate = new ProductDTO(name, price, quantity);
        ProductDTO productCreated = productRepository.saveProduct(productToCreate);

        return new ProductDTO(productCreated.getName(), productCreated.getPrice(), productCreated.getQuantity());
    }
}
