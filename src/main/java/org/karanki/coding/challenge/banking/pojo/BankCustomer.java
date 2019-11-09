package org.karanki.coding.challenge.banking.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class BankCustomer implements Pojo, Serializable, Cloneable  {

	private static final long serialVersionUID = -8380434295738220100L;

	/** Class Logger */
	public final static Logger LOGGER = Logger.getLogger(BankCustomer.class.getName());
	
	/**
	 * Primary Key / Record Identified, This ID is used to identify a record from
	 * technical perspectives like Primary Key in Database.
	 **/
	private Identity ID;
	
	
	private String customerId;
	
	private String firstName;
	
	private String lastName;
	
	private Date dob;
	
	/* Date of Registration*/
	private Date dor;
	
	private Address address;
	

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
	public BankCustomer clone() throws CloneNotSupportedException {

		BankCustomer newlyCloned = (BankCustomer) super.clone();
		newlyCloned.setIdentity(((LongIntegerIdentity) getIdentity()).clone());

		if (LOGGER.isLoggable(Level.INFO)) {
			LOGGER.info("New cloned Bank Customer data value [" + newlyCloned + "]");
		}

		return newlyCloned;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.NO_CLASS_NAME_STYLE);
	}
	
	/**
	 * Returned true, when {@link #customerId} of the current object, and the
	 * compared one are equal.
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof BankCustomer)) {
			return false;
		}

		if (obj == this) {
			return true;
		}

		return this.customerId == ((BankCustomer) obj).customerId;
	}

	/**
	 * Returns the hash code of {@link #customerId}.
	 */
	@Override
	public int hashCode() {
		return customerId.hashCode();
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDor() {
		return dor;
	}

	public void setDor(Date dor) {
		this.dor = dor;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
