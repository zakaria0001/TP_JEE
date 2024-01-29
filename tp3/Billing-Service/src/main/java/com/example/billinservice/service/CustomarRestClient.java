package com.example.billinservice.service;


import com.example.billinservice.models.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomarRestClient {
    @GetMapping(path = "/customers/{id}")
    Customer findCustomerById(@PathVariable Long id);


}
