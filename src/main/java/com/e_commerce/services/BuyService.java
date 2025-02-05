package com.e_commerce.services;

import com.e_commerce.dtos.BuyDTO;
import jakarta.validation.Valid;

public interface BuyService {
    BuyDTO makePurchase(@Valid BuyDTO buyRequest);
}
