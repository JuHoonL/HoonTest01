package com.biz.test_1105;

public class CompAssignOp {

	public static void main(String[] args) {
		
		short num = 10;				
		
		num = (short)(num + 77l);	//형 변환 안하면 컴파일 오류 발생
		
		int rate = 3;
		
		rate = (int)(rate * 3.5);	//형 변환 안하면 컴파일 오류 발생
		
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77l;
		rate = 3;
		rate *= 3.5;
		System.out.println(num);
		System.out.println(rate);
				
	}
}
