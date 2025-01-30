package com.e_commerce.controllers;

import com.e_commerce.dtos.ProductDTO;
import com.e_commerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct (@RequestBody ProductDTO productRequest){
        ProductDTO productResponse = productService.createProduct(productRequest.getName(), productRequest.getPrice(), productRequest.getQuantity());
        return ResponseEntity.status(HttpStatus.CREATED).body(productResponse);
    }
}
