package com.e_commerce.repositories;

import com.e_commerce.dtos.ProductDTO;
import com.e_commerce.models.ProductModel;

import java.util.List;

public interface ProductRepository {
    ProductDTO saveProduct(ProductDTO productToCreate);
    List<ProductModel> findAllProducts();
}
