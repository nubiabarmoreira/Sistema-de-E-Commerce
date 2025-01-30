package com.e_commerce.services;

import com.e_commerce.dtos.ClientDTO;

public interface ClientService {
    ClientDTO createClient(String name, String cpf, String email);
    ClientDTO findClientByCpf(String cpf);
}
