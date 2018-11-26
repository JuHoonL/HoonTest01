package com.biz.test_1126;

public class ImmutableString {
	public static void main(String[] args) {
		String str1 = "Simple String";
		String str2 = "Simple String";
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		System.out.println(str3);
		System.out.println(str4);
		
		if(str1 == str2)
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		
		if(str3.equals(str4)) 			// 문자열의 경우 ==는 오류날수있음 (해당 문자열이 저장된 주소를 비교할수있어서), 항상 문자열은 객체.equals(상대객체)를 사용
			System.out.println("str3과 str4는 동일 인스턴스 참조");
		else
			System.out.println("str3과 str4는 다른 인스턴스 참조");
	}
}
