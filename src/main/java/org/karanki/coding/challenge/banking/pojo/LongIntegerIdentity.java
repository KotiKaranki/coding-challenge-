package org.karanki.coding.challenge.banking.pojo;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * One of few possible implementations of {@link Identity}. The implementation
 * is used to store primary key as long data type, which would be the record
 * identifier for the underlying persistence storage.
 * 
 * @author Koti Karanki
 * @since Oct 2019
 *
 * @param <T>
 *            {@link CRUDContract} implementation to be returned,
 *            post-persistence operation.
 */
public class LongIntegerIdentity implements Identity, Cloneable, Serializable {

	/** Class Logger */
	public final static Logger LOGGER = Logger
			.getLogger(LongIntegerIdentity.class.getName());

	/** fixed serial version ID */
	private static final long serialVersionUID = -8065465653751286268L;

	/** Primary Key */
	private long PK;

	/**
	 * Constructs empty object of {@link LongIntegerIdentity}. Lets keep this
	 * empty constructor as needed by the rest framework to pass
	 * {@link Identity} information to client.
	 */
	public LongIntegerIdentity() {

	}

	/**
	 * Constructs the identity key for {@link LongIntegerIdentity}.
	 * 
	 * @param PK
	 *            primary key as long data type.
	 */
	public LongIntegerIdentity(long PK) {

		this.PK = PK;
	}

	@Override
	public long getPK() {

		return PK;

	}

	/**
	 * Sets Primary Key.
	 * 
	 * @param PK
	 *            Primary key to be set into.
	 */
	public void setPK(long PK) {
		this.PK = PK;
	}

	/**
	 * Returns true, when 2 primary keys are equals of the compared objects.
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof LongIntegerIdentity)) {
			return false;
		}

		if (obj == this) {
			return true;
		}

		return this.PK == ((LongIntegerIdentity) obj).PK;
	}

	/**
	 * Returns hash code of the primary key. The long type is converted with
	 * hack, so only unique hash code is returned, though some bits are lost
	 * due to long to integer conversion.
	 */
	@Override
	public int hashCode() {
		return (int) (PK ^ (PK >>> 32));
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.NO_CLASS_NAME_STYLE);
	}

	@Override
	public LongIntegerIdentity clone() throws CloneNotSupportedException {

		LongIntegerIdentity newlyCloned = (LongIntegerIdentity) super.clone();

		if (LOGGER.isLoggable(Level.INFO)) {
			LOGGER.info("New cloned LongInteger value [" + newlyCloned + "]");
		}

		return newlyCloned;
	}

}
