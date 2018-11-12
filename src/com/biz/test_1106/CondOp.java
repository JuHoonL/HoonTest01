package com.biz.test_1106;

public class CondOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 50;
		int num2 = 100;
		int big;
		int diff;
		
		big = (num1 > num2) ? num1 : num2 ;
		System.out.println("큰수 : " + big);
		
		diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		System.out.println("절댓값 : " + diff);
	}

}
