package org.karanki.coding.challenge.banking.pojo;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class BankAccount implements Pojo, Serializable, Cloneable {


	/** Class Logger */
	public final static Logger LOGGER = Logger.getLogger(BankAccount.class.getName());
	
	private static final long serialVersionUID = 6190652781872325313L;
	
	/**
	 * Primary Key / Record Identified, This ID is used to identify a record from
	 * technical perspectives like Primary Key in Database.
	 **/
	private Identity ID;
	
	private String accountNo;
	private BankCustomer bankCustomer;
	private AccountType accountType;
	private double accountBalance;
	
	@Override
	public Identity getIdentity() {
		return ID;
	}
	
	/**
	 * Sets {@link #ID}, which is the primary key/technical record identifier of
	 * airport.
	 * 
	 * @param ID
	 */
	public void setIdentity(Identity ID) {
		this.ID = ID;
	}
	
	@Override
	public BankAccount clone() throws CloneNotSupportedException {

		BankAccount newlyCloned = (BankAccount) super.clone();
		newlyCloned.setIdentity(((LongIntegerIdentity) getIdentity()).clone());

		if (LOGGER.isLoggable(Level.INFO)) {
			LOGGER.info("New cloned Bank Account data value [" + newlyCloned + "]");
		}

		return newlyCloned;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.NO_CLASS_NAME_STYLE);
	}
	
	/**
	 * Returned true, when {@link #accountNo} of the current object, and the
	 * compared one are equal.
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof BankAccount)) {
			return false;
		}

		if (obj == this) {
			return true;
		}

		return this.accountNo == ((BankAccount) obj).accountNo;
	}

	/**
	 * Returns the hash code of {@link #accountNo}.
	 */
	@Override
	public int hashCode() {
		return accountNo.hashCode();
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BankCustomer getBankCustomer() {
		return bankCustomer;
	}

	public void setBankCustomer(BankCustomer bankCustomer) {
		this.bankCustomer = bankCustomer;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
