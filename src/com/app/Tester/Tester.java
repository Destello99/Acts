package com.app.Tester;

import java.time.LocalDate;
import java.util.Scanner;
import static Validate_rule.AccountNumberCheck.checkAccount;
import static Validate_rule.AccountNumberCheck.checkMinBalance;
import com.app.banking.AccountType;
import com.app.banking.BankAccount;

import util.BalanceInsufficientException;
import util.accountduplicateException;

public class Tester {

	public static void main(String[] args) throws accountduplicateException, BalanceInsufficientException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of accounts : ");
		int size = sc.nextInt();
		BankAccount bnkt[] = new BankAccount[size];
		int count = 0;
		boolean flag = false;
		while (!flag) {

			System.out.println("Please choose options from below " + "\n1 : Enter account details\n"
					+ "2 : Display all accounts details\n" + "3 : withdraw\n" 
					+ "4 : Deposit\n" + "5 : Fund Transfer\n"
					+ "0 : Exit");

			switch (sc.nextInt()) {
			case 1: // Accepting Account Details
				System.out.println("Enter Account type: SAVING , CURRENT");
				AccountType accType = AccountType.valueOf(sc.next().toUpperCase());
				System.out.println("Enter Account Balance");
				double balance = checkMinBalance(sc.nextDouble(), accType);
				System.out.println("Enter account number");
				int accNumber = checkAccount(sc.nextInt(), bnkt);
				System.out.println("Enter Name");
				String name = new String(sc.next());
				System.out.println("Enter account opening date");
				bnkt[count++] = new BankAccount(accNumber, name, accType, balance, LocalDate.parse(sc.next()));
				break;

			case 2:
				BankAccount.display(bnkt);
				break;

			case 3:// Withdraw
				System.out.println("Enter Account number");
				BankAccount tempaccount = new BankAccount(sc.nextInt());
				boolean status = false;
				int cc = 0;
				for (int i = 0; i < bnkt.length; i++) {
					if (status = bnkt[i].equals(tempaccount)) {
						cc++;
						break;
					}
					cc++;

				}
				if (status) {
					System.out.println("Enter Amount to Withdraw: ");
					bnkt[--cc].withdraw(sc.nextDouble());
				}
				break;

			case 4: // Deposit
				System.out.println("Enter Account number");
				status = false;
				cc = 0;
				tempaccount = new BankAccount(sc.nextInt());
				for (int i = 0; i < bnkt.length; i++) {
					if (status = bnkt[i].equals(tempaccount)) {
						cc++;
						break;
					}
					cc++;
				}
				if (status) {
					System.out.println("Enter Amount to Deposite: ");
					bnkt[--cc].deposit(sc.nextDouble());
				} else {
					System.out.println("No such Account");
				}
				System.out.println(bnkt[cc]);

				break;
			case 5: // Fund transfer

				System.out.println("Enter first Account number");
				status = false;
				int cc1 = 0;
				tempaccount = new BankAccount(sc.nextInt());
				for (int i = 0; i < bnkt.length; i++) {
					if (status = bnkt[i].equals(tempaccount)) {
						cc1++;
						break;
					}
					cc1++;
				}
				System.out.println("Enter second Account number");
				status = false;
				int cc2 = 0;
				tempaccount = new BankAccount(sc.nextInt());
				for (int i = 0; i < bnkt.length; i++) {
					if (status = bnkt[i].equals(tempaccount)) {
						cc2++;
						break;
					}
					cc2++;

				}
				System.out.println("Enter Money to transfer");
				double money = sc.nextDouble();
				bnkt[--cc1].fundTransfer(bnkt[--cc2], money);
				break;
			case 0: // Exit
				flag = true;
				System.out.println("See you again :)");
				break;

			}
		}
		sc.close();
	}
}
