package com.emsi.EbankService.web;


import com.emsi.EbankService.DTO.BankAccountRequestDTO;
import com.emsi.EbankService.DTO.BankAccountResponcetDTO;
import com.emsi.EbankService.Service.AccountService;
import com.emsi.EbankService.entities.BankAccount;
import com.emsi.EbankService.entities.Customer;
import com.emsi.EbankService.repositories.BankAccountRepository;
import com.emsi.EbankService.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BankAccountGraphQLController {
private BankAccountRepository bankAccountRepository;
private CustomerRepository customerRepository;
@Autowired
private AccountService accountService;
BankAccountRequestDTO bankAccountRequestDTO;

    public BankAccountGraphQLController(BankAccountRepository bankAccountRepository , CustomerRepository customerRepository ) {
        this.bankAccountRepository = bankAccountRepository;
        this.customerRepository = customerRepository;
    }

    @QueryMapping
    public List<BankAccount> accountsList(){
        return bankAccountRepository.findAll();
    }

    @QueryMapping
    public BankAccount accountById(@Argument String id){
        return bankAccountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
    }

    @MutationMapping
    public BankAccountResponcetDTO addAccount(@Argument BankAccountRequestDTO bankAccount){
        return accountService.addAccount(bankAccount);
    }

    @MutationMapping
    public BankAccountResponcetDTO updateAccount(@Argument String id, @Argument BankAccountRequestDTO bankAccount){
        return accountService.updateAccount(id, bankAccount);
    }

    @MutationMapping
    public void deleteAccount(@Argument String id){
         bankAccountRepository.deleteById(id);
    }


    @QueryMapping
    public List<Customer> customarsList(){
        return customerRepository.findAll();
    }

    @QueryMapping
    public Customer customerById(@Argument Long id){
        return customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    @QueryMapping
    public List<BankAccount> accountsByCustomer(@Argument Long id){
        return bankAccountRepository.findByCustomerId(id);
    }


}
