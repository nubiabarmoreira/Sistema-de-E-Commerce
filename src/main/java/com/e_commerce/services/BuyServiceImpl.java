package com.e_commerce.services;

import com.e_commerce.dtos.BuyDTO;
import com.e_commerce.dtos.ProductDTO;
import com.e_commerce.repositories.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

@Service
public class BuyServiceImpl implements BuyService {
    @Autowired
    BuyRepository buyRepository;

    @Override
    public BuyDTO makePurchase(BuyDTO buyRequest) {
        BuyDTO buyToMade = new BuyDTO(long id, int stock, String CPF, List<ProductDTO> productsList);
    }
}
