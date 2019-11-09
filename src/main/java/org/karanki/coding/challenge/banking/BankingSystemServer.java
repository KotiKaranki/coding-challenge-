package org.karanki.coding.challenge.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot application server. The bootstrap point for the banking application.
 * 
 * @author Koti Karanki (http://kotikaranki.com)
 * @since Oct 2019
 *
 */
//@SpringBootApplication(scanBasePackages = "org.karanki.coding.challenge.banking")
@SpringBootApplication
//@ComponentScan("org.karanki.coding.challenge.banking")
public class BankingSystemServer {

	public static void main(String[] args) {
		SpringApplication.run(BankingSystemServer.class, args);
	}

}
