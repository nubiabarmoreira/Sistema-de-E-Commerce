package com.e_commerce.repositories;

import com.e_commerce.dtos.ClientDTO;
import com.e_commerce.models.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DatabaseClientRepository extends JpaRepository<ClientModel, Long> {
    Optional<ClientModel> findClientByCPF(String CPF);
}
