package com.biz.test_1108;

public class Test_05_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1부터 99까지의 합을 구하는 프로그램을 작성하되 while문을 이용해서 작성해보자.
		 */
		
		int n = 0;
		int Sum = 0;
		
		while(n < 99) {
			Sum += n;
			n++;
		}
		System.out.println(Sum);
	}

}
