package com.e_commerce.repositories;

import com.e_commerce.dtos.ClientDTO;
import com.e_commerce.dtos.ProductDTO;
import com.e_commerce.dtos.ProductRequestDTO;
import com.e_commerce.models.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static ch.qos.logback.core.joran.spi.ConsoleTarget.findByName;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Autowired
    private DatabaseProductRepository databaseProductRepository;

    @Override
    public ProductDTO saveProduct(ProductDTO productToCreate) {
        ProductModel productToSave = new ProductModel(productToCreate.getName(), productToCreate.getPrice(), productToCreate.getQuantity());
        ProductModel productSaved = databaseProductRepository.save(productToSave);

        return new ProductDTO(productSaved.getName(), productSaved.getPrice(), productSaved.getQuantity());
    }

    @Override
    public List<ProductModel> findAllProducts() {
        return databaseProductRepository.findAll();
    }

    @Override
    public ProductDTO findProductByName(ProductRequestDTO productRequestDTO) {
        ProductModel productByName = databaseProductRepository
                .findProductByName(productRequestDTO.getName())
                .orElseThrow(() -> new RuntimeException("Produto " + productRequestDTO.getName() + " não encontrado."));

        return new ProductDTO(productByName.getName(), productByName.getPrice(), productByName.getQuantity());
    }
}
