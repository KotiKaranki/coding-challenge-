package org.karanki.coding.challenge.banking.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@PropertySource("classpath:application.properties")
public class BankAppConfig {

	@Bean /* Singleton by default*/
	public Bank getHostedBank(
			@Value("${business.config.bankName}") String bankName,
			 @Value("${business.config.bankRegNo}") String bankRegNo,
			 @Value("${business.config.bankAddress}") String bankAddress
			 ) {
		return new Bank(bankName, bankRegNo, bankAddress);
	}
	
}
