package com.e_commerce.repositories;

import com.e_commerce.dtos.ClientDTO;
import com.e_commerce.models.ClientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepositoryImpl implements ClientRepository{
    @Autowired
    private DatabaseClientRepository databaseClientRepository;

    @Override
    public ClientDTO saveClient(ClientDTO clientToSave) {
        ClientModel clientModel = new ClientModel(clientToSave.getName(), clientToSave.getCPF(), clientToSave.getEmail());
        ClientModel clientSaved = databaseClientRepository.save(clientModel);

        return new ClientDTO(clientSaved.getName(), clientSaved.getCPF(), clientSaved.getEmail());
    }
}
