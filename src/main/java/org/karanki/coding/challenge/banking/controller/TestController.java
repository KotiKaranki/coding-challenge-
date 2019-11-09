package org.karanki.coding.challenge.banking.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/test")
@RestController
public class TestController {

	@RequestMapping(path = "/time")
	public String getTime() {
		return new Date().toString();
	}
}
