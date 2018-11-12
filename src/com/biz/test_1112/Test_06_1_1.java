package com.biz.test_1112;

public class Test_06_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 정수 둘을 인자로 전달받아서 두 수의 사칙연산 결과를 출력하는 메소드와 이 메소드를 호출하는
		 * main 메소드를 정의해 보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
		 */

		int intNum1 = 8;
		int intNum2 = 2;
		
		intSum(intNum1, intNum2);
	}
	public static void intSum(int intNum1, int intNum2) {
		int intSum = intNum1 + intNum2;
		int intMa = intNum1 - intNum2;
		int intX = intNum1 * intNum2;
		int intVa = intNum1 / intNum2;
		
		System.out.printf("합은 %d, 빼기는 %d, 곱은 %d, 나누기는 %d 이다.", intSum, intMa, intX, intVa);
	}
}
