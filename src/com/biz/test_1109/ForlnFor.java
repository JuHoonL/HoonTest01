package com.biz.test_1109;

public class ForlnFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 3 ; i++) {						// 바깥쪽 for문
			System.out.println("======================");
			for(int j = 0 ; j < 3 ; j++) {					// 안쪽 for문
				System.out.print("[" + i + "," + j + "]");
			}
			System.out.print('\n');
		}

	}

}
