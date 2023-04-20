package com.app.banking;

import java.time.LocalDate;

public class BankAccount {

	private int number;
	private String name;
	AccountType account; // Enum
	private double accountBalance;
	private LocalDate openingDate;

	public BankAccount(int number, String name, AccountType account, double accountBalance, LocalDate openingDate) {
		super();
		this.number = number;
		this.name = name;
		this.account = account; // enum
		this.accountBalance = accountBalance;
		this.openingDate = openingDate;
	}

	public BankAccount() {

	}

	public BankAccount(int number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return "BankAccount [number=" + number + ", name=" + name + ", accountType=" + account + ", accountBalance="
				+ accountBalance + ", openingDate=" + openingDate + "]";
	}

	@Override
	public boolean equals(Object acc) {
		if (this.number == ((BankAccount) acc).number)
			return true;
		return false;
	}

	public void deposit(double money) {
		System.out.println("your money is depositing....");
		this.accountBalance = this.accountBalance + money;
	}

	public void fundTransfer(BankAccount anotherBankAccount, double money) {
		this.withdraw(money);
		anotherBankAccount.deposit(money);

		System.out.println("current balance of bank 1 : " + this.accountBalance);
		System.out.println("current balance of bank 2 : " + anotherBankAccount.accountBalance);
	}

	public void withdraw(double money) {

		if (money < this.accountBalance) {
			System.out.println("your money is withdrawing....");
			this.accountBalance = this.accountBalance - money;
			System.out.println("current balance : " + this.accountBalance);
		} else {
			System.out.println("insufficient balance");
		}
	}

	public AccountType getAccount() {
		return account;
	}

	public void setAccount(AccountType account) {
		this.account = account;
	}

	public static void display(BankAccount[] bnkt) {
		for (BankAccount v : bnkt) {
			System.out.println(v);
		}
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;

	}

}
