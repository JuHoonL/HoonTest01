package com.biz.test_1116;

public class BankAccountConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount01 yoon = new BankAccount01("12-34-89", "990990-9090990", 10000);
		BankAccount01 park = new BankAccount01("33-55-09", "770088-5959007", 10000);
		
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(2000);
		yoon.checkMyBalance();
		park.checkMyBalance();
	}

}
