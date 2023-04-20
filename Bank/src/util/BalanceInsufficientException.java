package util;
@SuppressWarnings("serial")
public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException(String msg) {
		super(msg);
	}
}
