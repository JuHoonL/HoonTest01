package com.biz.test_1116;

public class BankAccountUniID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount01 yoon = new BankAccount01();		//계좌생성
		yoon.BankAccount01("12-34-89", "990990-9090990", 10000);		// 초기화
		
		BankAccount01 park = new BankAccount01();		//계좌생성
		park.BankAccount01("33-55-09", "770088-5959007", 10000);		//초기화
		
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(2000);
		yoon.checkMyBalance();
		park.checkMyBalance();
	}

}
