package com.emsi.EbankService.web;

import com.emsi.EbankService.DTO.BankAccountRequestDTO;
import com.emsi.EbankService.DTO.BankAccountResponcetDTO;
import com.emsi.EbankService.Service.AccountService;
import com.emsi.EbankService.entities.BankAccount;
import com.emsi.EbankService.mappers.Accountmapper;
import com.emsi.EbankService.repositories.BankAccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountRestController {

    private BankAccountRepository bankAccountRepository;
    private AccountService accountService;
    private Accountmapper accountmapper;

    public AccountRestController(BankAccountRepository bankAccountRepository, AccountService accountService, Accountmapper accountmapper) {
        this.bankAccountRepository = bankAccountRepository;
        this.accountService = accountService;
        this.accountmapper = accountmapper;
    }


    @GetMapping("/bankAccounts")
    public List<BankAccount> getBankAccounts() {
        return bankAccountRepository.findAll();
    }

    @GetMapping("/bankAccount/{id}")
    public BankAccount getBankAccounts(@PathVariable String id) {
        return bankAccountRepository.findById(id).orElseThrow( ()-> new RuntimeException("Account not found"));
    }
    @PostMapping("/bankAccount")
    public BankAccountResponcetDTO saveBankAccount(@RequestBody BankAccountRequestDTO bankAccountRequestDTO) {
        return accountService.addAccount(bankAccountRequestDTO);
    }
    @PutMapping("/bankAccount/{id}")
    public BankAccount updateBankAccount(@PathVariable String id, @RequestBody BankAccount bankAccount) {
       BankAccount account = bankAccountRepository.findById(id).orElseThrow( ()-> new RuntimeException("Account not found"));
       if (bankAccount.getBalance() != 0){
           account.setBalance(bankAccount.getBalance());

       }
         if (bankAccount.getAccountType() != null){
              account.setAccountType(bankAccount.getAccountType());

         }
            if (bankAccount.getCurrency() != null){
                account.setCurrency(bankAccount.getCurrency());

            }
                if (bankAccount.getCreationDate() != null){
                    account.setCreationDate(bankAccount.getCreationDate());

                }
                    return bankAccountRepository.save(account);
    }
    @DeleteMapping("/bankAccount/{id}")
    public void deleteBankAccount(@PathVariable String id) {
        bankAccountRepository.deleteById(id);
    }




}
