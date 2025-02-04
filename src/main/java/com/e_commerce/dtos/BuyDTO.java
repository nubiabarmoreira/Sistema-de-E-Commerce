package com.e_commerce.dtos;

public class BuyDTO {
    private long id;
    private String clientCpf;
    private String productName;
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