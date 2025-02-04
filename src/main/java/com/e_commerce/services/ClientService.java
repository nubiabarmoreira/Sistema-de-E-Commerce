package com.e_commerce.services;

import com.e_commerce.dtos.ClientDTO;

public interface ClientService {
    ClientDTO createClient(String name, String CPF, String email);
    ClientDTO findClientByCpf(String CPF);
    ClientDTO updateClientData(String CPF, ClientDTO clientRequest);
}
