package com.e_commerce.services;

import com.e_commerce.dtos.BuyDTO;
import com.e_commerce.dtos.ClientDTO;
import com.e_commerce.dtos.ProductDTO;
import com.e_commerce.models.ProductModel;
import com.e_commerce.repositories.BuyRepository;
import com.e_commerce.repositories.ClientRepository;
import com.e_commerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.apache.logging.log4j.util.Strings.isEmpty;

@Service
public class BuyServiceImpl implements BuyService {
    @Autowired
    BuyRepository buyRepository;
    ClientRepository clientRepository;
    ProductRepository productRepository;

    @Override
    public void makePurchase(BuyDTO buyRequest) {
        ClientDTO clientToBuy = clientRepository.findClientByCpf(buyRequest.getCPF());
        if(!clientToBuy.isEmpty()){
            throw new RuntimeException("Cliente com CPF " + clientToBuy.getCPF() + " não encontrado.");
        }

        for (ProductDTO productDTO : buyRequest.getProductsList()){
            ProductModel productModel = productRepository.findProductByName(productDTO.getName())
                    .orElseThrow(() -> new RuntimeException("Produto não encontrado: " + productDTO.getName()));

            if(productModel.getQuantity() <= 0){
                throw new RuntimeException("Produto sem estoque: " + productDTO.getName());
            }

            productModel.setQuantity(productModel.getQuantity() - buyRequest.getQuantityToBuy());
            ProductDTO productToBuy = new ProductDTO(productModel.getName(), productModel.getPrice(), productModel.getQuantity());
            productRepository.saveProduct(productToBuy);
        }
    }
}
