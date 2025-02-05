package com.e_commerce.services;

import com.e_commerce.dtos.BuyDTO;
import com.e_commerce.repositories.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyServiceImpl implements BuyService {
    @Autowired
    BuyRepository buyRepository;

    @Override
    public void makePurchase(BuyDTO buyRequest) {
        buyRequest.getCPF()
    }
}
