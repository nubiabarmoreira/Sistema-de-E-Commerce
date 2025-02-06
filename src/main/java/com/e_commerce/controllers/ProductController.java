package com.e_commerce.controllers;

import com.e_commerce.dtos.ProductDTO;
import com.e_commerce.dtos.ProductRequestDTO;
import com.e_commerce.services.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct (@Valid @RequestBody ProductDTO productRequest){
        ProductDTO productResponse = productService.createProduct(productRequest.getName(), productRequest.getPrice(), productRequest.getQuantity());
        return ResponseEntity.status(HttpStatus.CREATED).body(productResponse);
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAllProducts (){
        List<ProductDTO> allProducts = productService.findAllProducts();
        return ResponseEntity.ok(allProducts);
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<ProductDTO> findProductByName (@RequestBody ProductRequestDTO productRequestDTO){
        ProductDTO productByName = productService.findProductByName(productRequestDTO);
        return ResponseEntity.ok(productByName);
    }
}
