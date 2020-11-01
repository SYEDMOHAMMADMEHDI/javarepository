package com.training.javaapp;

public class BankAccount {

	String accountNo;
	String accountName;
	int balance =1000;

	public BankAccount() {
	}

	public BankAccount(String accountNo, String accountName) {
		this.accountNo = accountNo;
		this.accountName = accountName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	@Override
	public String toString() {
		return "BankAccount{" +
				"accountNo='" + accountNo + '\'' +
				", accountName='" + accountName + '\'' +
				", balance=" + balance +
				'}';
	}
}
