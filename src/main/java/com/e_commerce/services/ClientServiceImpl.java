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
    public ClientDTO findClientByCpf(String CPF) {
        return clientRepository.findClientByCpf(CPF);
    }

    @Override
    public ClientDTO updateClientData(String CPF, ClientDTO clientRequest) {
        ClientDTO clientToUpdate = clientRepository.findClientByCpf(CPF);

        if(clientRequest.getName() != null || clientRequest.getName().isBlank()){
            throw new RuntimeException("O nome do cliente deve ser informado.");
        } else {
            clientToUpdate.setName(clientRequest.getName());
        }

        if(clientRequest.getCPF() != null || clientRequest.getCPF().isBlank()){
            throw new RuntimeException("O CPF do cliente deve ser informado.");
        } else {
            clientToUpdate.setCPF(clientRequest.getCPF());
        }

        if(clientRequest.getEmail() != null || clientRequest.getEmail().isBlank()){
            throw new RuntimeException("O email do cliente deve ser informado.");
        } else {
            clientToUpdate.setEmail(clientRequest.getEmail());
        }

        clientRepository.updateClientData(CPF, clientToUpdate);

        return new ClientDTO(clientToUpdate.getName(), clientToUpdate.getCPF(),clientToUpdate.getEmail());
    }
}
