package com.biz.test_1116;

public class DupRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;		// ref1이 참조하는 대상을 ref2도 참조
		
		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref2.withdraw(300);
		ref1.checkMybalance();
		ref2.checkMybalance();
		
	}

}
