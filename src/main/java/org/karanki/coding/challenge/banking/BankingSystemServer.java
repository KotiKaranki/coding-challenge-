package org.karanki.coding.challenge.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = "org.karanki.coding.challenge.banking")
@SpringBootApplication
//@ComponentScan("org.karanki.coding.challenge.banking")
public class BankingSystemServer {

	public static void main(String[] args) {
		SpringApplication.run(BankingSystemServer.class, args);
	}

}
