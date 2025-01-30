package com.e_commerce.repositories;

import com.e_commerce.dtos.ClientDTO;

public interface ClientRepository {
    ClientDTO saveClient(ClientDTO clientToSave);
    ClientDTO findClientByCpf(String cpf);
    ClientDTO updateClientData(String cpf, ClientDTO clientToUpdate);
}
