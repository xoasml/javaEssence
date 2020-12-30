package thisIsJava.package_Source_C;

import thisIsJava.Source05_A;

public class Source05_C {
	public Source05_C() {
		Source05_A a = new Source05_A();
		
		a.field1 = 1;
//		a.field2 = 1;	// default 필드 접근 불가
//		a.field3 = 1;	// private 필드 접근 불가
		
		a.method1();
//		a.method2();	// default 메서드 접근 불가
//		a.method3();	// private 메서드 접근 불가
	}
}
