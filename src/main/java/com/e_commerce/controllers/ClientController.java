package com.e_commerce.controllers;

import com.e_commerce.dtos.ClientDTO;
import com.e_commerce.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<ClientDTO> createClient (@RequestBody ClientDTO clientRequest){
        ClientDTO clientResponse = clientService.createClient(clientRequest.getName(), clientRequest.getCPF(), clientRequest.getEmail());
        return ResponseEntity.status(HttpStatus.CREATED).body(clientResponse);
    }

    @GetMapping("{CPF}")
    public ResponseEntity<ClientDTO> findClientByCpf (String CPF){
        ClientDTO clientByCPF = clientService.findClientByCpf(CPF);
        return ResponseEntity.ok(clientByCPF);
    }

}
