package com.biz.test_1113;

public class InfRecul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showHi(3) ;
		

	}

	public static void showHi(int cnt) {
		System.out.println("Hi~ ");
		if(cnt == 1)
			return ;
		// showHi(cnt--);
		showHi(--cnt);
	}
}
