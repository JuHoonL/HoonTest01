package com.biz.test_1126;

public class CompString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = "Lexicograthically";
		String st2 = "lexicograthically";
		int cmp;
		
		if(st1.equals(st2))
			System.out.println("두 문자열은 같습니다.");
		else 
			System.out.println("두 문자열은 다릅니다.");
		
		cmp = st1.compareTo(st2);		// 사전편찬 순서상 st1이 st2보다 앞서면 0보다 작은 값반환, 반대면 0보다 큰값 반환
		
		if(cmp == 0)
			System.out.println("두 문자열은 일치합니다.");
		else if(cmp <0)				// 사전편찬 순서상 st1이 st2보다 앞서므로 0보다 작은값 반환
			System.out.println("사전의 앞에 위치하는 문자 : " + st1);
		else
			System.out.println("사전의 앞에 위치하는 문자 : " + st2);
		
		if(st1.compareToIgnoreCase(st2) == 0) 		// Ignore는 대소문자 상관없이라는 명령어
			System.out.println("두 문자열은 같습니다.");
		else
			System.out.println("두 문자열은 다릅니다.");
	}

}
