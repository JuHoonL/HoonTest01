package com.biz.test_1105;

public class Test_1105_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문제5. 변수 n1, n2, n3가 다음과 같을 때 n1>n2>m3 이면 true, 아니면 false를 출력하는 프로그램을 작성해보자.
		 
			n1 = {(25 + 5) + (36 / 4) - 72} * 5
			n2 = {(25 X 5) + (36 - 4) + 72} / 4
			n3 = (128 / 4) X 2
		*/
				
		int n1 = ((25 + 5) + (36 / 4) - 72) * 5;
		int n2 = ((25 * 5) + (36 - 4) + 72) / 4;
		int n3 = (128 / 4) * 2;
		
		boolean result;
				
		result = (n1 > n2) && (n2 > n3);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(result);
		
		
	}

}
