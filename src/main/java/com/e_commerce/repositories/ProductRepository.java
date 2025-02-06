package com.e_commerce.repositories;

import com.e_commerce.dtos.ProductDTO;
import com.e_commerce.dtos.ProductRequestDTO;
import com.e_commerce.models.ProductModel;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    ProductDTO saveProduct(ProductDTO productToCreate);
    List<ProductModel> findAllProducts();
    ProductDTO findProductByName(ProductRequestDTO productRequestDTO);
}
