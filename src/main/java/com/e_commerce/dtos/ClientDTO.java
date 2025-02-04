package com.e_commerce.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

public class ClientDTO {
    private long id;

    @NotBlank(message = "O nome do cliente deve ser informado.")
    @Size(min = 2, max = 100, message = "O nome do cliente deve ter entre 2 e 100 caracteres.")
    private String name;

    @CPF(message = "Informe um CPF válido.")
    @Column(unique = true)
    @NotBlank(message = "O CPF do cliente deve ser informado.")
    private String CPF;

    @Email(message = "Informe um e-mail válido.")
    @Column(unique = true)
    @NotBlank(message = "O e-mail do cliente deve ser informado.")
    private String email;

    public ClientDTO() {}

    public ClientDTO(String name, String CPF, String email) {
        this.name = name;
        this.CPF = CPF;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}