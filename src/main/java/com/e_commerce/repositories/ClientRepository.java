package com.e_commerce.repositories;

import com.e_commerce.dtos.ClientDTO;

public interface ClientRepository {
    ClientDTO saveClient(ClientDTO clientToSave);
    ClientDTO findClientByCPF(String CPF);
    ClientDTO updateClientData(String CPF, ClientDTO clientToUpdate);
}
