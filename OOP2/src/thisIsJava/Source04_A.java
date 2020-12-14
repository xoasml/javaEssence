package thisIsJava;

public class Source04_A {
	//필드
	Source04_A a1 = new Source04_A(true);		// (o)
	Source04_A a2 = new Source04_A(1);			// (o)
	Source04_A a3 = new Source04_A("문자열");	// (o)
	
	// 생성자
	public Source04_A(boolean b) {}
	Source04_A(int b) {}
	private Source04_A(String s) {}
}
