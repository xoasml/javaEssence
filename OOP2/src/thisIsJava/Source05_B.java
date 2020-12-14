package thisIsJava;

public class Source05_B {
	public Source05_B() {
		Source05_A a = new Source05_A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1;	// private변수 접근 불가
		
		a.method1();
		a.method2();
//		a.method3();	// private 메서드 접근 불가
	}
}
