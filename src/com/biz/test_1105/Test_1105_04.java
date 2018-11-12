package com.biz.test_1105;

public class Test_1105_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제4. 다음 계산 결과를 출력하는 프로그램을 작성하되, 덧셈 연산의 횟수를 최소화하여 작성해보자
		// 3 + 6	3 + 6 + 9	3 + 6 + 9 + 12
		
		int num1 = 3;
		int num2 = 6;
		int num3 = 9;
		int num4 = 12;
		
		int result1 = num1 + num2;
		int result2 = result1 + num3;
		int result3 = result2 + num4;
		
		System.out.println("3 + 6 = " + result1);
		System.out.println("3 + 6 + 9 = " + result2);
		System.out.println("3 + 6 + 9 + 12 = " + result3);

	}

}
