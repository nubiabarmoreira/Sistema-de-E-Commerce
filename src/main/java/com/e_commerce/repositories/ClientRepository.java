package com.e_commerce.repositories;

import com.e_commerce.dtos.ClientDTO;

import java.util.Optional;

public interface ClientRepository {
    ClientDTO saveClient(ClientDTO clientToSave);
    Optional<ClientDTO> findClientByCpf(String cpf);
}
