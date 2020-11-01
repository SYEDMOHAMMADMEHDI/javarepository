package com.training.Basic;

public class Main {

	public static void main(String args[]){

		Bank b = new Bank();
		b.BankAccount[0]="1";
		b.BankAccount[1]="2";
		b.BankAccount[2]="3";
		b.BankAccount[3]="4";
		b.BankAccount[4]="5";
		b.accountNo();
		System.out.println("Account number is : " + b.AccountNo);
		System.out.println(b.toString());




	}
}
