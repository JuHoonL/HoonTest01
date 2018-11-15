package com.biz.test_1113;

public class Test_06_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		intBino(makeNum());
		System.out.println(intBino(makeNum()));
		intBino(makeNum());
		
	}
	
	public static int makeNum() {
		return (int)(Math.random() * (10-1+1))+1;
	}
	
	public static int intBino(int inti) {
		if(inti == 0)
			return 1 ;
		return 2 * intBino(inti - 1) ;
	}
	
	/*
	  
	 */
}
