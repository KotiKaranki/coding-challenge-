package org.karanki.coding.challenge.banking.pojo;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The POJO represents a single ATM machine information of the hosted bank.
 * 
 * @author Koti Karanki
 * @since Oct 2019
 *
 */
public class ATM implements Pojo, Serializable, Cloneable {

	/** Class Logger */
	public final static Logger LOGGER = Logger.getLogger(ATM.class.getName());

	/** hard-coded serial version ID */
	private static final long serialVersionUID = -1313783156479630173L;


	/**
	 * Primary Key / Record Identified, This ID is used to identify a record from
	 * technical perspectives like Primary Key in Database.
	 **/
	private Identity ID;
	
	/** latitude value in degrees */
	double latitude;

	/** longitude value in degrees */
	double longitude;

	
	private String atmId;
	

	
	
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

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
	public ATM clone() throws CloneNotSupportedException {

		ATM newlyCloned = (ATM) super.clone();
		newlyCloned.setIdentity(((LongIntegerIdentity) getIdentity()).clone());

		if (LOGGER.isLoggable(Level.INFO)) {
			LOGGER.info("New cloned ATM  data value [" + newlyCloned + "]");
		}

		return newlyCloned;
	}

	public String getAtmId() {
		return atmId;
	}

	public void setAtmId(String atmId) {
		this.atmId = atmId;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.NO_CLASS_NAME_STYLE);
	}
	
	/**
	 * Returned true, when {@link #atmId} of the current object, and the
	 * compared one are equal.
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof ATM)) {
			return false;
		}

		if (obj == this) {
			return true;
		}

		return this.atmId == ((ATM) obj).atmId;
	}

	/**
	 * Returns the hash code of {@link #atmId}.
	 */
	@Override
	public int hashCode() {
		return atmId.hashCode();
	}

}
