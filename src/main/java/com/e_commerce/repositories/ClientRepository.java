package com.e_commerce.repositories;

import com.e_commerce.dtos.ClientDTO;

public interface ClientRepository {
    ClientDTO saveClient(ClientDTO clientToSave);
}
