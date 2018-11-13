package com.biz.test_1113;

public class Test_06_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 인자로 원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메소드와 원의 둘레를 계산해서
		 * 반환하는 메소드를 각각 정의하고, 이 둘을 호출하는 main 메소드를 정의하자.
		 */
		System.out.println(valS(makeRadius()));
		System.out.println(valQ(makeRadius()));
		
		int Num1 = 5 ;
		System.out.println(valS(Num1));
		System.out.println(valQ(Num1));
		
	}
	public static int makeRadius() {
		return (int)(Math.random() * (30 - 1 + 1)) + 1;
	}
	
	public static float valS(int intN) {
		return (float)(intN * intN * 3.14) ;
	}
	
	public static float valQ(int intN) {
		return (float)(intN * 2 * 3.14) ;
	}
	// 원의 넓이 = 반지름 X 반지름 X 3.14
	// 원의 둘레 = 2 X 반지름 X 3.14 
}
