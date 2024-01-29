package com.emsi.EbankService.Service;

import com.emsi.EbankService.DTO.BankAccountRequestDTO;
import com.emsi.EbankService.DTO.BankAccountResponcetDTO;
import com.emsi.EbankService.entities.BankAccount;
import com.emsi.EbankService.enums.AccountType;

public interface AccountService {
     BankAccountResponcetDTO addAccount(BankAccountRequestDTO bankAccountRequestDTO);
}
