package com.biz.test_1112;

public class Test_05_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  구구단의 짝수 단인 2, 4, 6, 8단만 출력하는 프로그램을 작성하되 
		 *  2단은 2 X 2까지, 4단은 4 X 4까지, 6단은 6 X 6까지, 8단은 8 X 8까지 출력하도록 작성하자. 
		 */
		
		for(int i = 1 ; i < 10 ; i ++) {
			if((i % 2) == 0) {
				for(int j = 1 ; j < 10 ; j ++) {
					System.out.printf("%d X %d = %d\n", i, j, i*j);
				}
				System.out.println("==================================");
			}
		}

	}

}
