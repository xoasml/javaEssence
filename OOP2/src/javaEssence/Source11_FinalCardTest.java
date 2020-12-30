package javaEssence;

class Card2 {
	final int NUMBER;			// 상수지만 명시적 초기화를 하지 않고
	final String KIND;			// 생성자에서 단 한번만 초기화할 수 있다.
	static int width = 100;
	static int height = 250;
	
	Card2(String kind, int number){
		KIND = kind;
		NUMBER = number;
	}
	
	Card2(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
	
}


public class Source11_FinalCardTest {
	public static void main(String[] args) {
		Card2 c = new Card2("HEART", 10);
//		c.NUMBER = 5;	// 상수를 변경하려 해서 err
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}
}
