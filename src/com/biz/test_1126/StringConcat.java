package com.biz.test_1126;

public class StringConcat {
	public static void main(String[] args) {
		String st1 = "Coffee";
		String st2 = "Bread";
		
		String st3 = st1.concat(st2); 		// 객체.concat(객체2)은 문자열을 연결시킴 객체에 객체2를 연결시킴
		System.out.println(st3);
		
		String st4 = "Fresh".concat(st3);
		System.out.println(st4);
	}
}
