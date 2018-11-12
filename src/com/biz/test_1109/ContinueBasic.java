package com.biz.test_1109;

public class ContinueBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int count = 0;
		
		while((num++) < 100) {
			if(((num % 5) != 0) || ((num % 7) != 0))	// 5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95 (5로 나눠서 몫이 0이아닌)
														// 7,14,21,28,35,42,49,56,63,70,77,84,91,98(7을 나눠서 몫이 0이 아닌)
				continue;								// 5와 7의 배수가 아니라면 나머지 건너뛰고 위로 이동
			count++;									// 5와 7의 배수인 경우만 실행
			System.out.println(num);					// 5와 7의 배수인 경우만 실행
		}
		System.out.println("count : " + count);
	}

}
