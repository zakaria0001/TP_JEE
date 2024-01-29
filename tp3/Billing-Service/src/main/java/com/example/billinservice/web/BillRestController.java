package com.example.billinservice.web;

import com.example.billinservice.entities.Bill;
import com.example.billinservice.repositories.BillRepository;
import com.example.billinservice.repositories.ProductItemRepository;
import com.example.billinservice.service.CustomarRestClient;
import com.example.billinservice.service.ProductRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillRestController {


    @Autowired
private BillRepository billRepository;
    @Autowired
private ProductItemRepository productItemRepository;
    @Autowired
private CustomarRestClient customerRestClient;
    @Autowired
private ProductRestClient productRestClient;

@GetMapping( "/fullBill/{id}")
public Bill bill(@PathVariable  Long id){
    Bill bill=billRepository.findById(id).get();
    bill.setCustomer(customerRestClient.findCustomerById(bill.getCustomerId()));
    bill.getProductItems().forEach(productItem->{
        productItem.setProduct(productRestClient.findProductById(productItem.getProductId()));
    });
    return bill;

}

}
