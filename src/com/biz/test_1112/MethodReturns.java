package com.biz.test_1112;

public class MethodReturns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result ;
		result = adder(4, 5);		//adder가 반환하는 값을 result에 저장
		System.out.println("4 + 5 = " + result);
		System.out.println("3.5 X 3.5 = " + square(3.5));
	}

	public static int adder(int intNum1, int intNum2) {
		int addResult = intNum1 + intNum2 ;
		return addResult ; 			//addResult의 값을 반환
	}
	
	public static double square(double num) {
		return num * num;			// num * num의 결과를 반환
	}
}
