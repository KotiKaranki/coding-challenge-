package org.karanki.coding.challenge.banking.configuration;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * It is a singleton per the JVM/application, which represents the hosted bank details.
 * 
 * @author Koti Karanki (http://kotikaranki.com)
 * @since Oct 2019
 *
 */
public class Bank {

	
	private String bankName;
	private String bankRegNo;
	private String bankAddress;
	
	
	
	public Bank(String bankName, String bankRegNo, String bankAddress) {
		super();
		this.bankName = bankName;
		this.bankRegNo = bankRegNo;
		this.bankAddress = bankAddress;
	}

	public String getBankName() {
		return bankName;
	}

	public String getBankRegNo() {
		return bankRegNo;
	}

	public String getBankAddress() {
		return bankAddress;
	}


	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.NO_CLASS_NAME_STYLE);
	}
	
}
