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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String CPF;
    private List<ProductDTO> productsList;
    private int quantityToBuy;

    public BuyModel() {}

    public BuyModel(long id, int stock, String CPF, List<ProductDTO> productsList, int quantityToBuy) {
        this.id = id;
        this.CPF = CPF;
        this.productsList = productsList;
        this.quantityToBuy = quantityToBuy;
    }

    public int getQuantityToBuy() {
        return quantityToBuy;
    }

    public void setQuantityToBuy(int quantityToBuy) {
        this.quantityToBuy = quantityToBuy;
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
