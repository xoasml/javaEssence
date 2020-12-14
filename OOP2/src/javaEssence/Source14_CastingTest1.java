package javaEssence;

public class Source14_CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
//		car.water(); // 컴파일 에러 Car타입의 참조변수는 water를 호출할 수 없다.
		fe2 = (FireEngine)car;
		fe2.water();
		
	}
}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car {	// 소방차
	void water() { // 물뿌리는 기능
		System.out.println("water~~~!");
	}
}
