package com.e_commerce.models;

import com.e_commerce.dtos.ClientDTO;
import com.e_commerce.dtos.ProductDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
public class BuyModel {
//    @Autowired
//    ClientDTO clientDTO;
//    ProductDTO productDTO;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int stock;
    private String CPF;
    private List<ProductDTO> productsList;

    public BuyModel() {}

    public BuyModel(long id, int stock, String CPF, List<ProductDTO> productsList) {
        this.id = id;
        this.stock = stock;
        this.CPF = CPF;
        this.productsList = productsList;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public List<ProductDTO> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<ProductDTO> productsList) {
        this.productsList = productsList;
    }
}
