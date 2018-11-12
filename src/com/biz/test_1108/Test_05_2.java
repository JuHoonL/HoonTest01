package com.biz.test_1108;

public class Test_05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 예제 CondOp.java를 조건 연산자를 사용하지 않고 대신에 if~else문을 사용하는 형태로 수정해보자
	    int num1 = 50;
		int num2 = 100;
		int big;
		int diff;
		
		big = (num1 > num2) ? num1 : num2 ;
		System.out.println("큰수 : " + big);
		
		diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		System.out.println("절댓값 : " + diff);
		 */
		
		int num1 = 50;
		int num2 = 100;
		
		if(num1 > num2) {
			System.out.println("큰수 : " + num1);
		} else {
			System.out.println("큰수 : " + num2);
		}
		if(num1 > num2) {
			System.out.println("절댓값 : " + (num1 - num2));
		} else {
			System.out.println("절댓값 : " + (num2 - num1));
		}
		System.out.println("\n");
		
		num1 = 50;
		num2 = 100;
		int big;
		int diff;
		
		if(num1 > num2) {
			big = num1;
		} else {
			big = num2;
		}
		System.out.println("큰수 : " + big);
		if(num1 > num2) {
			diff = (num1 - num2);
		} else {
			diff = (num2 - num1);
		}
		System.out.println("절댓값 : " + diff);
		
	}

}
