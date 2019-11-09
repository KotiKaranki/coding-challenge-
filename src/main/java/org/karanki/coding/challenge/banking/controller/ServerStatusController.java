package org.karanki.coding.challenge.banking.controller;

import java.util.Date;

import org.karanki.coding.challenge.banking.configuration.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The server configuration & monitoring system
 *  
 * @author Koti Karanki (http://kotikaranki.com)
 * @since Oct 2019
 *
 */
@RequestMapping(path = "/server")
@RestController
public class ServerStatusController {

	@Autowired
	private Bank bank;
	
	@RequestMapping(path = "/health")
	public String getHealth() {
		return "OK & GREEN";
	}
	
	@RequestMapping(path = "/datetime")
	public String getTime() {
		return new Date().toString();
	}
	
	@RequestMapping(path = "/hosted-bank")
	public Bank getHostedBankDetails() {
		return bank;
	}
	
	
}
