package javaEssence;

public class Source19_BindingTest3 {
	public static void main(String[] args) {
		Parent19 p = new Child19();
		Child19 c = new Child19();
		
		System.out.println("p.x : " + p.x);
		p.method();
		
		System.out.println();
		
		System.out.println("c.x : " + c.x);
		c.method();
	}
}

class Parent19{
	int x = 100;
	
	void method() {
		System.out.println("부모 메서드");
	}
}

class Child19 extends Parent19{
	int x = 200;
	
	@Override
	void method() {
		System.out.println("x : " + x);	//this.x와 같음
		System.out.println("super.x : " + super.x);
		System.out.println("this.x : " + this.x);
	}
}