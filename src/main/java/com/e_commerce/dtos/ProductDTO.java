package com.e_commerce.dtos;

public class ProductDTO {
    private long id;

//    @NotBlank(message = "O nome do produto deve ser informado.")
//    @Size(min = 2, max = 100, message = "O nome do produto deve ter entre 2 e 100 caracteres.")
    private String name;

//    @NotNull(message = "O preço do produto deve ser informado.")
//    @Positive(message = "O preço do produto deve ser maior do que zero.")
    private Double price;

//    @NotNull(message = "A quantidade do produto deve ser informada.")
//    @PositiveOrZero(message = "A quantidade do produto deve ser maior ou igual a zero.")
    private int quantity;

    public ProductDTO() {}

    public ProductDTO(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
