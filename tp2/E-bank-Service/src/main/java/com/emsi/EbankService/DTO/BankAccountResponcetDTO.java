package com.emsi.EbankService.DTO;

import com.emsi.EbankService.enums.AccountType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class BankAccountResponcetDTO {

    @Id
    private String id;
    private Date CreationDate;
    private double balance;

    private  String currency;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

}
