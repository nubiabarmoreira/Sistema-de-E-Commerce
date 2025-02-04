package com.e_commerce.controllers;

import com.e_commerce.dtos.ClientDTO;
import com.e_commerce.services.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<ClientDTO> createClient (@Valid @RequestBody ClientDTO clientRequest){
        ClientDTO clientResponse = clientService.createClient(clientRequest.getName(), clientRequest.getCPF(), clientRequest.getEmail());
        return ResponseEntity.status(HttpStatus.CREATED).body(clientResponse);
    }

    @GetMapping("/CPF/{CPF}")
    public ResponseEntity<ClientDTO> findClientByCpf (String CPF){
        ClientDTO clientByCPF = clientService.findClientByCpf(CPF);
        return ResponseEntity.ok(clientByCPF);
    }

    @PutMapping("/CPF/{CPF}")
    public ResponseEntity<ClientDTO> updateClientData (@PathVariable String cpf, @RequestBody ClientDTO clientRequest){
        ClientDTO clientResponse = clientService.updateClientData(cpf, clientRequest);
        return ResponseEntity.ok().body(clientResponse);
    }

}
