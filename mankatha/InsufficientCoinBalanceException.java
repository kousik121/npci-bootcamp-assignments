package com.mankatha;

public class InsufficientCoinBalanceException extends Exception{
	public InsufficientCoinBalanceException() {
		
	}
	public InsufficientCoinBalanceException(String msg) {
		super(msg);
	}
}
