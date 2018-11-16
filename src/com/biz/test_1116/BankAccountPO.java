package com.biz.test_1116;

public class BankAccountPO {
	static int balance = 0;		//예금잔액

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deposit(10000);		//입금진행
		checkMybalance();	//잔액확인
		withdraw(3000);		//출금진행
		checkMybalance();	//잔액확인
	}
	
	public static int deposit(int amount) {		//입금을 담당하는 메소드
		balance += amount ; 
		return balance;
	}
	
	public static int withdraw(int amount) {		//출금을 담당하는 메소드
		balance -= amount ;
		return balance;
	}
	
	public static int checkMybalance() {		//예금 조회를 담당하는 메소드
		System.out.println("잔액 : " + balance);
		return balance;
	}

}
