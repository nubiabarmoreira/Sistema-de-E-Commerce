package com.e_commerce.dtos;

import jakarta.validation.constraints.*;

public class ProductRequestDTO {
    private long id;

    @NotBlank(message = "O nome do produto deve ser informado.")
    @Size(min = 2, max = 100, message = "O nome do produto deve ter entre 2 e 100 caracteres.")
    private String name;

    public ProductRequestDTO() {}

    public ProductRequestDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
