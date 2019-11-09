package org.karanki.coding.challenge.banking.pojo;

import java.io.Serializable;



/**
 * Base class for all POJOs with in the AWS project scope. All POJO must
 * implement the {@link Pojo}. Common code/framework code as far as POJO
 * operations are concerned.
 * 
 * @author Koti Karanki
 * @since Oct 2019
 *
 */
public interface Pojo extends Serializable, Cloneable {

	/**
	 * Primary key, which is a record identifier for each POJO. The key it self
	 * used by persistence storage mechanism to identify the records from each
	 * other.
	 * 
	 * @return {@link Identity} the primary key.
	 */
	public Identity getIdentity();

}
