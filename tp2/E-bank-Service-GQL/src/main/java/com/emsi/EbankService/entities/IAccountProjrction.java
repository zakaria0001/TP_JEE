package com.emsi.EbankService.entities;


import com.emsi.EbankService.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = BankAccount.class , name = "p1")
public interface IAccountProjrction {

    public String getId();
    public AccountType AccountType();
    public double getBalance();

}
