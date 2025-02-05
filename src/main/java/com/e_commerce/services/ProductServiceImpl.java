package com.e_commerce.services;

import com.e_commerce.dtos.ProductDTO;
import com.e_commerce.models.ProductModel;
import com.e_commerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<ProductDTO> findAllProducts() {
        List<ProductModel> allProducts = productRepository.findAllProducts();
        return allProducts
                .stream()
                .map(products -> new ProductDTO(products.getName(), products.getPrice(), products.getQuantity()))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO findProductByName(String name) {
        return productRepository.findProductByName(name);
    }
}
