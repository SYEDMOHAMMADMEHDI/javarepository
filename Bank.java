package com.training.Basic;

import java.util.Arrays;

public class Bank {
	String [] BankAccount = new String[5];
	int AccountNo;


	public String[] getBankAccount() {
		return BankAccount;
	}

	public void setBankAccount(String[] bankAccount) {
		BankAccount = bankAccount;
	}
	static int lastAssignedNo = 0;
	public void accountNo(){
		AccountNo=lastAssignedNo;
		lastAssignedNo++;
		for(lastAssignedNo=0;lastAssignedNo<=5;lastAssignedNo++){
			System.out.println(AccountNo);
		}
	}

	@Override
	public String toString() {
		return "Bank{" +
				"BankAccount=" + Arrays.toString(BankAccount) +
				'}';
	}
}


