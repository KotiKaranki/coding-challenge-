package org.karanki.coding.challenge.banking.pojo;

public enum AccountType {

	SAVING, CURRENT, FIXED, RD;

	public static void main(String[] args) {

		for (AccountType type : AccountType.values()) {
			System.err.println(type);
		}

		AccountType type = AccountType.valueOf("SAVING");

		System.err.println("***   " + type + ", " + type.equals(SAVING));

	}
}
