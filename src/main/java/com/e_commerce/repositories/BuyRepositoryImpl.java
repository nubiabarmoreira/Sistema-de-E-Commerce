package com.e_commerce.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BuyRepositoryImpl implements BuyRepository {
    @Autowired
    DatabaseBuyRepository databaseBuyRepository;


}
