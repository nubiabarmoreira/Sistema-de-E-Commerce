package com.e_commerce.models;

import jakarta.persistence.Entity;

@Entity
public class ClientModel {
    private String name;
    private String CPF;
    private String email;

    public ClientModel() {}

    public ClientModel(String name, String CPF, String email){
        this.name = name;
        this.CPF = CPF;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}