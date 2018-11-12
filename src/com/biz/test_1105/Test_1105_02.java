package com.biz.test_1105;

public class Test_1105_02 {
	public static void main(String[] args) {
		//문제2. 예제 SCE.java의 실행결과를 보면 
				//변수 num2의 값이 증가하지 않았음을 알 수있다. 그렇다면 예저를 어떻게 수정해야 nm2의 값이 증가하겠는가 ?
				
				int num1 = 0;
				int num2 = 0;
				
				boolean result;
				
				result = ((num1 += 10) < 0) || ((num2 += 10) > 0);
				System.out.println("result = " + result);
				System.out.println("num1 = " + num1);
				System.out.println("num2 = " + num2 + '\n');
				
				result = ((num1 += 10) > 0) && ((num2 += 10) > 0);
				System.out.println("result = " + result);
				System.out.println("num1 = " + num1);
				System.out.println("num2 = " + num2 + '\n');

	}
}
