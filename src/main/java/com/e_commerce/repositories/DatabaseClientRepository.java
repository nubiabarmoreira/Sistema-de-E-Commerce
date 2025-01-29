package com.e_commerce.repositories;

import com.e_commerce.models.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatabaseClientRepository extends JpaRepository<ClientModel, Long> {
}
