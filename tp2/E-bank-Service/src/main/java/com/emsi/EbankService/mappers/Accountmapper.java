package com.emsi.EbankService.mappers;

import com.emsi.EbankService.DTO.BankAccountResponcetDTO;
import com.emsi.EbankService.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;



@Component
public class Accountmapper {

public BankAccountResponcetDTO fromBankAccount(BankAccount  bankAccount){
    BankAccountResponcetDTO bankAccountResponcetDTO = new BankAccountResponcetDTO();
    BeanUtils.copyProperties(bankAccount,bankAccountResponcetDTO);
    return bankAccountResponcetDTO;
}
}
