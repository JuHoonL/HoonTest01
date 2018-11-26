package com.biz.test_1126;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = "abcdefg";
		String st2 = st1.substring(2);		// 인덱스 2 이후의 내용으로 이뤄진 문자열 "cdefg" 반환
		System.out.println(st2);
		
		String st3 = st1.substring(2, 4);	// 인덱스 2이후부터 4바로전까지의 내용으로 이뤄진 문자열 "cd" 반환
		System.out.println(st3);
	}

}
