package com.app.banking;

public enum AccountType {
	CURRENT(2000), SAVING(500);

	private double minBalance;

	private AccountType(int a){
		this.minBalance = a;
	}

	public double getMinBalance() {
		return this.minBalance;
	}
}
