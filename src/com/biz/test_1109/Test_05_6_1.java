package com.biz.test_1109;

public class Test_05_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 예제 ContinueBasic.java에 존재하는 while문을 for문으로 변경해보자.
		 */

		int num = 0;
		int count = 0;
		
		for(num = 1 ; num < 100 ; num++) {
			if(((num % 5) != 0) || ((num % 7) != 0))
				continue;							
			count++;									
			System.out.println(num);					
		}
		System.out.println("count : " + count);
	}

}
