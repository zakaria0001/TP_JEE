package com.emsi.EbankService.entities;

import com.emsi.EbankService.enums.AccountType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccount {
    @Id
    private String id;
    private Date CreationDate;
    private double balance;

    private  String currency;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    @ManyToOne
    private Customer customer;
}
