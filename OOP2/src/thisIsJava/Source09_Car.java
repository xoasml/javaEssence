package thisIsJava;

public class Source09_Car {
	// 필드
	Source09_Tire fLTire = new Source09_Tire("왼쪽앞", 6);
	Source09_Tire fRTire = new Source09_Tire("오른쪽앞", 2);
	Source09_Tire bLTire = new Source09_Tire("왼쪽뒤", 3);
	Source09_Tire bRTire = new Source09_Tire("오른쪽뒤", 4);
	//생성자
	//메서드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(fLTire.roll() == false) { stop(); return 1; }
		if(fRTire.roll() == false) { stop(); return 2; }
		if(bLTire.roll() == false) { stop(); return 3; }
		if(bRTire.roll() == false) { stop(); return 4; }
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
