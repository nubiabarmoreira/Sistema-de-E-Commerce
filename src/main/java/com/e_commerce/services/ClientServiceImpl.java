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
    public ClientDTO createClient(String name, String cpf, String email) {
        ClientDTO clientToSave = new ClientDTO(name, cpf, email);
        ClientDTO clientSaved = clientRepository.saveClient(clientToSave);

        return new ClientDTO(clientSaved.getName(), clientSaved.getCPF(), clientSaved.getEmail());
    }

    @Override
    public ClientDTO findClientByCpf(String cpf) {
        return clientRepository.findClientByCpf(cpf);
    }
}
