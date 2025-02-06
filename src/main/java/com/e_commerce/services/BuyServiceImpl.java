package com.e_commerce.services;

import com.e_commerce.dtos.BuyDTO;
import com.e_commerce.dtos.ClientDTO;
import com.e_commerce.dtos.ProductDTO;
import com.e_commerce.models.ProductModel;
import com.e_commerce.repositories.ClientRepository;
import com.e_commerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyServiceImpl implements BuyService {
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    ProductRepository productRepository;

    @Override
    public void makePurchase(BuyDTO buyRequest) {
//        checkIfClientExists(buyRequest);
//        checkIfProductExistsAndCheckQuantityOfProduct(buyRequest);

        ClientDTO clientToBuy = clientRepository.findClientByCPF(buyRequest.getCPF());
        if (clientToBuy == null){
            throw new RuntimeException("Cliente com CPF " + clientToBuy.getCPF() + " não encontrado.");
        }

        for (ProductDTO productDTO : buyRequest.getProductsList()) {
            ProductDTO product = productRepository.findProductByName(productDTO.getName());
            if (product == null) {
                throw new RuntimeException("Produto não encontrado: " + productDTO.getName());
            }

            if (product.getQuantity() <= 0){
                throw new RuntimeException("Produto sem estoque: " + product.getName());
            }

            product.setQuantity(product.getQuantity() - buyRequest.getQuantityToBuy());
            ProductDTO productToBuy = new ProductDTO(product.getName(), product.getPrice(), product.getQuantity());
            productRepository.saveProduct(productToBuy);
        }

//    private void checkIfClientExists(BuyDTO buyRequest) {
//        ClientDTO clientToBuy = clientRepository.findClientByCPF(buyRequest.getCPF());
//        if(clientToBuy == null){
//            throw new RuntimeException("Cliente com CPF " + clientToBuy.getCPF() + " não encontrado.");
//        }
//    }

//    private void checkIfProductExistsAndCheckQuantityOfProduct(BuyDTO buyRequest) {
//        for (ProductDTO productDTO : buyRequest.getProductsList()) {
//            ProductDTO product = productRepository.findProductByName(productDTO.getName());
//            if (product == null) {
//                throw new RuntimeException("Produto não encontrado: " + productDTO.getName());
//            }
//
//        if (product.getQuantity() <= 0){
//            throw new RuntimeException("Produto sem estoque: " + product.getName());
//        }
//
//        product.setQuantity(product.getQuantity() - buyRequest.getQuantityToBuy());
//        ProductDTO productToBuy = new ProductDTO(product.getName(), product.getPrice(), product.getQuantity());
//        productRepository.saveProduct(productToBuy);
    }
}
