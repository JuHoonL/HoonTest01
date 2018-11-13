package com.biz.test_1113;

public class Test_06_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 정수 둘을 인자로 전달받아서, 두 수의 '차의 절대값'을 
		 * 계산하여 출력하는 메소드와 이 메소드를 호출하는 main 메소드를 정의해 보자.
		 * 단 메소드 호출 시 전달되는 값의 순서에 상관없이 절대값이 계산되고 출력되어야 한다.
		 */
		
			int Num1 = makeNum();
			int Num2 = makeNum();
			
			intMath(Num1, Num2);
			intMath(Num1, Num2);
			intMath(Num1, Num2);
		}
	
	public static void intMath(int intN1, int intN2) {
		if(intN1 > intN2) {
			System.out.println(intN1 - intN2);
		} else if(intN1 < intN2) {
			System.out.println(intN2 - intN1);
		}
	}
	
	public static int makeNum() {
		return (int)(Math.random() * 11) ;
	}
}
