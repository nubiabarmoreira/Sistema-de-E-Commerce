package com.e_commerce.services;

import com.e_commerce.dtos.ClientDTO;
import com.e_commerce.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService{
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public ClientDTO createClient(String name, String CPF, String email) {
        ClientDTO clientToSave = new ClientDTO(name, CPF, email);
        ClientDTO clientSaved = clientRepository.saveClient(clientToSave);

        return new ClientDTO(clientSaved.getName(), clientSaved.getCPF(), clientSaved.getEmail());
    }

    @Override
    public ClientDTO findClientByCPF(String CPF) {
        return clientRepository.findClientByCPF(CPF);
    }

    @Override
    public ClientDTO updateClientData(String CPF, ClientDTO clientRequest) {
        ClientDTO clientToUpdate = clientRepository.findClientByCPF(CPF);

        clientToUpdate.setName(clientRequest.getName());
        clientToUpdate.setCPF(clientRequest.getCPF());
        clientToUpdate.setEmail(clientRequest.getEmail());

        clientRepository.updateClientData(CPF, clientToUpdate);

        return new ClientDTO(clientToUpdate.getName(), clientToUpdate.getCPF(),clientToUpdate.getEmail());
    }
}
