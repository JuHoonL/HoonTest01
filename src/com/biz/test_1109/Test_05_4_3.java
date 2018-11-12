package com.biz.test_1109;

public class Test_05_4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1000이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력하고, 
		   그 수들의 합을 구해서 출력하는 프로그램을 while문을 이용해서 작성해보자.ㅣ
		 */
		
		int n = 1;
		int Sum = 0;
		while(n <= 1000) {
			if((n%2)==0 && (n%7)==0) {
				System.out.println("2의 배수이자 7의 배수 인 " + n);
				Sum += n;
			}
			n++;
		}
		System.out.println("2의 배수이자 7의 배수 인 수의 총 합은 : " + Sum);
	}

}
