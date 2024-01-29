package com.emsi.EbankService.DTO;

import com.emsi.EbankService.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class BankAccountRequestDTO {
    private double balance;
    private  String currency;
    private AccountType accountType;
}
