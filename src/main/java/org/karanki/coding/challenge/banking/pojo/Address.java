package org.karanki.coding.challenge.banking.pojo;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Address implements Pojo, Serializable, Cloneable {


	/** Class Logger */
	public final static Logger LOGGER = Logger.getLogger(Address.class.getName());
	
	private static final long serialVersionUID = 9129596812857103239L;

	
	/**
	 * Primary Key / Record Identified, This ID is used to identify a record from
	 * technical perspectives like Primary Key in Database.
	 **/
	private Identity ID;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String coutry;
	
	private String pin;
	
	
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
	public Address clone() throws CloneNotSupportedException {

		Address newlyCloned = (Address) super.clone();
		newlyCloned.setIdentity(((LongIntegerIdentity) getIdentity()).clone());

		if (LOGGER.isLoggable(Level.INFO)) {
			LOGGER.info("New cloned Address data value [" + newlyCloned + "]");
		}

		return newlyCloned;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.NO_CLASS_NAME_STYLE);
	}
	
	/**
	 * Returned true, when {@link #ID} of the current object, and the
	 * compared one are equal.
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Address)) {
			return false;
		}

		if (obj == this) {
			return true;
		}

		return this.ID == ((Address) obj).ID;
	}

	/**
	 * Returns the hash code of {@link #ID}.
	 */
	@Override
	public int hashCode() {
		return ID.hashCode();
	}

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCoutry() {
		return coutry;
	}

	public void setCoutry(String coutry) {
		this.coutry = coutry;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
}
