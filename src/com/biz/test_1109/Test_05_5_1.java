package com.biz.test_1109;

public class Test_05_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1부터 10까지의 곱의 결과를 출력하는 프로그램을 for문을 이용해서 작성해보자.
		 */
		int mulP = 1;
		for(int n = 1 ; n <= 10 ; n++) {
			mulP *= n; 
		}
		System.out.println("1부터 10까지의 합은 " + mulP);
	}

}
