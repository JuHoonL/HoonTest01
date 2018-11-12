package com.biz.test_1109;

public class InfinityLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		
		while(true) {
			if(((num % 6) == 0) && ((num % 14) == 0))
				break;
			num++;
		}
		System.out.println(num);
	}

}
