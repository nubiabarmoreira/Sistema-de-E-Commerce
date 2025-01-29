package com.e_commerce.dtos;

public class ClientDTO {
    private String name;
    private String CPF;
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