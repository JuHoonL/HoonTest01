package com.biz.test_1112;

public class ByTimesWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2 ;
		int j ;
		
		while(i < 10) {
			j = 1 ;
			while(j < 10) {
				System.out.println(i + " X " + j + " = " + (i * j));
				j ++;
			}
			i ++;
		}

	}

}
