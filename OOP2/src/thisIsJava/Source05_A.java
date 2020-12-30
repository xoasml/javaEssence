package thisIsJava;

public class Source05_A {
	// 필드
	public int field1;	// public 접근 제한자
	int field2;			// default 접근 제한자
	private int field3;	// private 접근 제한자
	
	// 생성자
	public Source05_A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	// 메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
}
