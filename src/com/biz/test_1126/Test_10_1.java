package com.biz.test_1126;

public class Test_10_1 {
	/*
	 * 다음 main 메소드와 함께 동작하는 Accumulator 클래스를 정의하자. 그리고 Accumulator 클래스에 main 메소드도 넣어서 컴파일 및 실행을 하자.
	 	public static void main(String[] args){
	 		for(int i = 0 ; i < 10 ; i ++) {
	 			Accumulator.add(i);		//인자로 전달되는 값을 모두 누적
	 		Accumulator.showResult();	//최종 누적 결과를 출력
	 		}
	 		
	     실행 결과로, 즉 showResult 메소드의 호출 결과로 다음과 같은 수준의 출력을 보이면 된다.
	      sum = 45 
	 */
	static int sum = 0;
	
	static void add(int i) {
		System.out.println(i + "번째 값은 " + i + "이다.");
		sum += i;
	}
	
	static void showResult(){
		System.out.println("sum = " + sum);
	}
	
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i ++) {
			Test_10_1.add(i);		//인자로 전달되는 값을 모두 누적
		Test_10_1.showResult();	//최종 누적 결과를 출력
 		}
	}
	
}
/*	class Accumulator {
		static int sum = 0;
		
		static void add(int i) {
			System.out.println(i + "번째 값은 " + i + "이다.");
			sum += i;
		}
		
		static void showResult(){
			System.out.println("sum = " + sum);
		}
		
		public static void main(String[] args) {
			for(int i = 0 ; i < 10 ; i ++) {
	 			Accumulator.add(i);		//인자로 전달되는 값을 모두 누적
	 		Accumulator.showResult();	//최종 누적 결과를 출력
	 		}
		} */
	
	
	
