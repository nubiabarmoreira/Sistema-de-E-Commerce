package com.e_commerce.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

public class BuyDTO {
    private long id;

    @NotBlank(message = "O CPF do cliente para a compra deve ser informado.")
    @CPF(message = "Informe um CPF do cliente para a compra válido.")
    private String clientCpf;

    @NotBlank(message = "O nome do produto a ser comprado deve ser informado.")
    @Size(min = 2, max = 100, message = "O nome do produto a ser comprado deve ter entre 2 e 100 caracteres.")
    private String productName;

    @NotBlank(message = "A quantidade de produtos em estoque deve ser informado.")
    @PositiveOrZero(message = "A quantidade de produtos em estoque deve ser maior ou igual a zero.")
    private int stock;

    public BuyDTO() {}

    public BuyDTO(String clientCpf, String productName, int stock) {
        this.clientCpf = clientCpf;
        this.productName = productName;
        this.stock = stock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClientCpf() {
        return clientCpf;
    }

    public void setClientCpf(String clientCpf) {
        this.clientCpf = clientCpf;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}