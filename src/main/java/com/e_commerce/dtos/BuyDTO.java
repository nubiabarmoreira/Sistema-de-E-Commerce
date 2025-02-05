package com.e_commerce.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import org.hibernate.validator.constraints.br.CPF;

import java.util.List;

public class BuyDTO {
    private long id;

    @NotBlank(message = "A quantidade de produtos em estoque deve ser informado.")
    @PositiveOrZero(message = "A quantidade de produtos em estoque deve ser maior ou igual a zero.")
    private int stock;

    @CPF(message = "Informe um CPF válido.")
    @Column(unique = true)
    @NotBlank(message = "O CPF do cliente deve ser informado.")
    private String CPF;

    private List<ProductDTO> productsList;

    public BuyDTO() {}

    public BuyDTO(long id, int stock, String CPF, List<ProductDTO> productsList) {
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