package com.e_commerce.controllers;

import com.e_commerce.dtos.BuyDTO;
import com.e_commerce.services.BuyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<HttpStatus> makePurchase (@Valid @RequestBody BuyDTO buyRequest){
       buyService.makePurchase(buyRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(buyRequest);
    }
}
