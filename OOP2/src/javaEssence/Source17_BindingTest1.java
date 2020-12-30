package javaEssence;

public class Source17_BindingTest1 {
	public static void main(String[] args) {
		Parent17 p = new Child17();
		Child17  c = new Child17();
		
		System.out.println(p.x);
		p.method();
		
		System.out.println(c.x);
		c.method();
	}
}

class Parent17{
	int x = 100;
	
	void method() {
		System.out.println("부모");
	}
}

class Child17 extends Parent17{
	int x = 200;
	
	@Override
	void method() {
		System.out.println("자식");
	}
}
