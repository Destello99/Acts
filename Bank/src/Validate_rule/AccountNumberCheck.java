package Validate_rule;

import com.app.banking.AccountType;
import com.app.banking.BankAccount;

import util.accountduplicateException;
import util.BalanceInsufficientException;

public class AccountNumberCheck {
	public static int checkAccount(int acc, BankAccount[] bnkt) throws accountduplicateException {
		// BankAccount checkAccount=new BankAccount(acc);

		// for (int i = 0; i < bnkt.length; i++) {
		// if (bnkt[i] != null)
		// if (bnkt[i].getNumber() == acc)
		// throw new accountduplicateException("account duplicate ");
		// }
		for (BankAccount b : bnkt) {
			if (b != null)
				if (b.getNumber() == acc)
					throw new accountduplicateException("account duplicate ");
		}
		return acc;
	}

	public static double checkMinBalance(double money, AccountType a) throws BalanceInsufficientException {
		if (money < a.getMinBalance()) {
			throw new BalanceInsufficientException("Min balance not allowed");
		}
		return money;
	}

}
