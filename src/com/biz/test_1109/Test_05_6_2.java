package com.biz.test_1109;

public class Test_05_6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 자연수 1부터 시작해서 모든 홀수를 더해 나간다. 
		 * 그리고 그 합이 언제(몇을 더했을 때) 1000을 넘어서는지, 
		 * 그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성해보자.
		 */
		
		int n = 0;
		int Sum = 0;
		for(n = 1 ; n >0 ; n++) {
			if((n % 2) != 0) {
				Sum += n;
			}
			if(Sum > 1000)
				break;
		}
		System.out.println("1부터 시작해서 모든 홀수를 더할 때 그 합이 1000을 넘어갈 때의 홀수는"+ n +"이고 그 합은 " + Sum + "이다." );
	}

}
