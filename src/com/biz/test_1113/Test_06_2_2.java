package com.biz.test_1113;

public class Test_06_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 전달된 값이 소수(Prime Number)인지 아닌지를 판단하여 소수인 경우 true를, 
		 * 소수가 아닌 경우 false를 반환하는 메소드를 정의하고, 이 메소드의  호출 결과를 기반으로
		 * 1 이상 100 이하의 소수를 전부 출력하는 main 메소드를 정의하자.
		 */
		
		for(int i = 1 ; i <= 100 ; i ++) {
			System.out.println(primeNum(i));
		}
		
	}

	public static boolean primeNum(int Num1) {

		if(Num1 == 1) {
			return false ;
		} for(int j = 2 ; j < Num1 ; j ++) {
			if((Num1 % j) == 0)
			return false ;
		}
		return true;
		
		
		
	}
}
