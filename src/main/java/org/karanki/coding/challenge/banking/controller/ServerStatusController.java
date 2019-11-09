package org.karanki.coding.challenge.banking.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/server")
@RestController
public class ServerStatusController {

	
	@RequestMapping(path = "/health")
	public String getHealth() {
		return "OK & GREEN";
	}
	
	@RequestMapping(path = "/datetime")
	public String getTime() {
		return new Date().toString();
	}
}
