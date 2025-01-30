package com.e_commerce.repositories;

import com.e_commerce.dtos.ProductDTO;

public interface ProductRepository {
    ProductDTO saveProduct(ProductDTO productToCreate);
}
