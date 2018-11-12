package com.biz.test_1112;

public class Test_05_7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 다음 식을 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하자.
		 			A B
				+	B A
				--------
					9 9
		 */
		
		
		for(int a = 1 ; a < 10 ; a ++) {
			for(int b = 1 ; b < 10 ; b ++) {
				if(((a * 10 + b)+(b * 10 + a)) == 99) {
					System.out.println(a + " , " + b);
				}
			}
		}
			
		

	}

}
