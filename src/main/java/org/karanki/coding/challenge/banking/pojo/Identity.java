package org.karanki.coding.challenge.banking.pojo;

import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Identity contract API, where sub classes are built, which acts as record
 * identifier.
 * 
 * @author Koti Karanki
 * @since Oct 2019
 *
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = 
		JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
		@Type(value = LongIntegerIdentity.class, 
				name = "LongIntegerIdentity") })
public interface Identity extends Serializable {

	/**
	 * Gets Primary Key / Record Identifier.
	 * 
	 * @return Returns primary key.
	 */
	public long getPK();

}
