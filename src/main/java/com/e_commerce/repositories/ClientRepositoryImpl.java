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
    public Optional<ClientDTO> findClientByCpf(String cpf) {
        ClientModel clientByCpfFound = databaseClientRepository
                .findClientByCpf(cpf)
                .orElseThrow(() -> new RuntimeException("Cliente com CPF " + cpf + " não encontrado."));

        return new Optional<ClientDTO>(clientByCpfFound.getName(), clientByCpfFound.getCPF(), clientByCpfFound.getEmail());
    }
}
