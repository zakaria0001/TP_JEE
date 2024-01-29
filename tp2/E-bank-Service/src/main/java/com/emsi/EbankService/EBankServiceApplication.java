package com.emsi.EbankService;

import com.emsi.EbankService.entities.BankAccount;
import com.emsi.EbankService.enums.AccountType;
import com.emsi.EbankService.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class EBankServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EBankServiceApplication.class, args);


	}

	@Bean
	CommandLineRunner start(BankAccountRepository BankAccountRepository) {
		return args -> {

			for (int i = 0; i < 10; i++) {
				BankAccount bankAccount = BankAccount.builder()
						.id(UUID.randomUUID().toString())
						.accountType(AccountType.CURRENT_ACCOUNT)
						.balance(1000 + Math.random() * 9000)
						.CreationDate(new Date())
						.currency("MAD")
						.build();
				BankAccountRepository.save(bankAccount);
			}


		};
	}
}

