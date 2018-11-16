package com.biz.test_1116;

public class BankAccount01 {
	String accNumber;
	String ssNumber;
	int balance = 0;
	
	public void BankAccount01(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;		// 계좌 개설 시 예금액으로 초기화
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("계좌번호: " + accNumber);
		System.out.println("주민번호: " + ssNumber);
		System.out.println("잔    액: " + balance + '\n');
		return balance;
		
	}
}
