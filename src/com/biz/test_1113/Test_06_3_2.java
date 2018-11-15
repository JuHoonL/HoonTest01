package com.biz.test_1113;

public class Test_06_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 인자로 십진수 정수를 전달받아서 이에 해당하는 이진수 표현을 출력하는 메소드를 재귀의 형태로 정의하고,
		 * 이를 호출하는 main 메소드를 정의해보자
		 */
		int n = makeNum();
		
		System.out.println(n);
		chaToT(n);
		System.out.println();
		System.out.println("6");
		chaToT(6);
		
	}

	public static int makeNum() {
		return (int)(Math.random() * 11);
	}
	
	public static void chaToT(int Num) {
		if(Num > 0) {
			int toTwo = Num % 2;
			Num /= 2;
			
			chaToT(Num);
			System.out.print(toTwo);
		}
	}
}
