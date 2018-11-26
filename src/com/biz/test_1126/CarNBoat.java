package com.biz.test_1126;

	class Car{
		void myCar() {
			System.out.println("This is my car");
		}
		
		public static void main(String[] args) {
			Car c = new Car(); 			// Car 인스턴스의 생성이 가능하다.
			c.myCar();
			Boat t = new Boat();
			t.myBoat();
		}
	}
	
	class Boat{
		void myBoat() {
			System.out.println("This is my boat");
		}
		
		public static void main(String[] args) {
			Car c = new Car();
			c.myCar();
			Boat t = new Boat();
			t.myBoat();
		}
	}

	class CarNBoat {
		void myBoat() {
			System.out.println("This is my boat");
		}

}
