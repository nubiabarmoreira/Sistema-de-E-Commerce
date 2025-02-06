package com.e_commerce.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import org.hibernate.validator.constraints.br.CPF;

import java.util.List;

public class BuyDTO {
    private long id;

    @CPF(message = "Informe um CPF válido.")
    @Column(unique = true)
    @NotBlank(message = "O CPF do cliente deve ser informado.")
    private String CPF;

    @NotBlank(message = "A lista de produtos a serem comprados deve ser informada.")
    private List<ProductDTO> productsList;

    @NotNull(message = "A quantidade do produto deve ser informada.")
    @PositiveOrZero(message = "A quantidade do produto deve ser maior ou igual a zero.")
    private int quantityToBuy;

    public BuyDTO() {}

    public BuyDTO(long id, int stock, String CPF, List<ProductDTO> productsList, int quantityToBuy) {
        this.id = id;
        this.CPF = CPF;
        this.productsList = productsList;
        this.quantityToBuy = quantityToBuy;
    }

    public String getCPF() {
        return CPF;
    }

    public int getQuantityToBuy() {
        return quantityToBuy;
    }

    public void setQuantityToBuy(int quantityToBuy) {
        this.quantityToBuy = quantityToBuy;
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