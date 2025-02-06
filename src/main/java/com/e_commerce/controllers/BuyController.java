package com.e_commerce.controllers;

import com.e_commerce.dtos.BuyDTO;
import com.e_commerce.services.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compras")
public class BuyController {
    @Autowired
    BuyService buyService;

    @PostMapping
    public void makePurchase (@RequestBody BuyDTO buyRequest) {
        buyService.makePurchase(buyRequest);
    }
}
