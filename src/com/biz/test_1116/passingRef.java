package com.biz.test_1116;

public class passingRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ref = new BankAccount();
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref);			// '참조 값' 의 전달
	}
	
	public static void check(BankAccount acc) {
		acc.checkMybalance();
	}

}
