package org.karanki.coding.challenge.banking.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class BankTransaction implements Pojo, Serializable, Cloneable {

	
	private static final long serialVersionUID = -8894562613604279639L;


	/** Class Logger */
	public final static Logger LOGGER = Logger.getLogger(BankTransaction.class.getName());
	
	
	/**
	 * Primary Key / Record Identified, This ID is used to identify a record from
	 * technical perspectives like Primary Key in Database.
	 **/
	private Identity ID;
	
	private String transactionNo;
	private BankAccount bankAccount;
	private Date transactionDate;
	private ATM transactionAtm;
	private TransactionType transactionType;
	
	
	
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
	public BankTransaction clone() throws CloneNotSupportedException {

		BankTransaction newlyCloned = (BankTransaction) super.clone();
		newlyCloned.setIdentity(((LongIntegerIdentity) getIdentity()).clone());

		if (LOGGER.isLoggable(Level.INFO)) {
			LOGGER.info("New cloned Bank Transaaction data value [" + newlyCloned + "]");
		}

		return newlyCloned;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.NO_CLASS_NAME_STYLE);
	}
	
	/**
	 * Returned true, when {@link #transactionNo} of the current object, and the
	 * compared one are equal.
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof BankTransaction)) {
			return false;
		}

		if (obj == this) {
			return true;
		}

		return this.transactionNo == ((BankTransaction) obj).transactionNo;
	}

	/**
	 * Returns the hash code of {@link #transactionNo}.
	 */
	@Override
	public int hashCode() {
		return transactionNo.hashCode();
	}
	
	
	public BankAccount getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public ATM getTransactionAtm() {
		return transactionAtm;
	}
	public void setTransactionAtm(ATM transactionAtm) {
		this.transactionAtm = transactionAtm;
	}
	public TransactionType getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}
	
	
}
