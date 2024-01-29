package com.emsi.EbankService.Service;

import com.emsi.EbankService.DTO.BankAccountRequestDTO;
import com.emsi.EbankService.DTO.BankAccountResponcetDTO;
import com.emsi.EbankService.entities.BankAccount;
import com.emsi.EbankService.enums.AccountType;
import com.emsi.EbankService.mappers.Accountmapper;
import com.emsi.EbankService.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
 @Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private Accountmapper accountmapper;
    @Override
    public BankAccountResponcetDTO addAccount(BankAccountRequestDTO bankAccountRequestDTO) {
        BankAccount bankAccount = BankAccount.builder()
                .id(UUID.randomUUID().toString())
                .accountType(bankAccountRequestDTO.getAccountType())
                .balance(bankAccountRequestDTO.getBalance())
                .CreationDate(new Date())
                .currency(bankAccountRequestDTO.getCurrency())
                .build();
        BankAccount savedBankAccount = bankAccountRepository.save(bankAccount);


        BankAccountResponcetDTO bankAccountResponcetDTO = accountmapper.fromBankAccount(savedBankAccount);
        return bankAccountResponcetDTO;
    }

    @Override
    public BankAccountResponcetDTO updateAccount(String id, BankAccountRequestDTO bankAccountRequestDTO) {
        BankAccount bankAccount = BankAccount.builder()
                .id(id)
                .accountType(bankAccountRequestDTO.getAccountType())
                .balance(bankAccountRequestDTO.getBalance())
                .CreationDate(new Date())
                .currency(bankAccountRequestDTO.getCurrency())
                .build();
        BankAccount savedBankAccount = bankAccountRepository.save(bankAccount);
        BankAccountResponcetDTO bankAccountResponcetDTO = accountmapper.fromBankAccount(savedBankAccount);
        return bankAccountResponcetDTO;


    }

}
