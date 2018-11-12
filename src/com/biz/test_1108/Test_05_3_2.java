package com.biz.test_1108;

public class Test_05_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 아래의 코드를 if ~ else 문이 아닌 switch문을 이용하는 형태로 변경해보자.
		 	class NumberRange {
		 		public static void main(String[] args) {
		 			int n = 24;
		 			if(n >= 0 && n < 10) 
		 				System.out.println("0이상 10미만의 수");
		 			else if(n >= 10 && n < 20)
		 				System.out.println("10이상 20미만의 수");
		 			else if(n >= 20 && n < 30)
		 				System.out.println("20이상 30미만의 수");
		 			else
		 				System.out.println("음수 혹은 30이상의 수");
		 		}
		 	}
		 */
		
		int n = 44;
		
		switch(n / 10) {
			case 1 : 
				System.out.println("0이상 10미만의 수");
				break;
			case 2 : 
				System.out.println("10이상 20미만의 수");
				break;
			case 3 : 
				System.out.println("20이상 30미만의 수");
				break;
			case 4 : 
				System.out.println("음수 혹은 30이상의 수"); // switch()에서 괄호안의 값이 Case 넘버 값이 나오게 만들면 됌.
		}
	}

}
