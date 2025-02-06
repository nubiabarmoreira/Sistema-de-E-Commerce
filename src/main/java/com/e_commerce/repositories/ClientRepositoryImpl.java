package com.e_commerce.repositories;

import com.e_commerce.dtos.ClientDTO;
import com.e_commerce.models.ClientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

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

    @Override
    public ClientDTO findClientByCPF(String CPF) {
        ClientModel clientByCpfFound = databaseClientRepository
                .findClientByCPF(CPF)
                .orElseThrow(() -> new RuntimeException("Cliente com CPF " + CPF + " não encontrado."));

        return new ClientDTO(clientByCpfFound.getName(), clientByCpfFound.getCPF(), clientByCpfFound.getEmail());
    }

    @Override
    public ClientDTO updateClientData(String CPF, ClientDTO clientToUpdate) {
        ClientModel clientModel = databaseClientRepository
                .findClientByCPF(CPF)
                .orElseThrow(() -> new RuntimeException("Cliente com CPF " + CPF + " não encontrado."));

        clientModel.setName(clientToUpdate.getName());
        clientModel.setCPF(clientToUpdate.getCPF());
        clientModel.setEmail(clientToUpdate.getEmail());

        ClientModel clientUpdated = databaseClientRepository.save(clientModel);

        return new ClientDTO(clientUpdated.getName(), clientUpdated.getCPF(), clientUpdated.getEmail());
    }
}
