package com.biz.test_1126;

public class Test_11_1 {
/*
 * 다음 주민등록 번호의 중간에 삽입된 -를 지우고 공백으로 채워서 출력하는 프로그램을 작성해 보자.
  		990925-1012999
 */
	public static void main(String[] args) {
		String num = "990925-1012999";
		String subNum1 = num.substring(0, 6);
		String subNum2 = num.substring(7);
		String finalNum = subNum1.concat(subNum2);
		
		System.out.println(finalNum);
	}
	
}
