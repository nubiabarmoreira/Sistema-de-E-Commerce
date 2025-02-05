package com.e_commerce.repositories;

import com.e_commerce.models.BuyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatabaseBuyRepository extends JpaRepository<BuyModel, Long> {
}
