package javaEssence;

public class Source18_BindingTest2 {
	public static void main(String[] args) {
		Parent18 p = new Child18();
		Child18  c = new Child18();
		
		System.out.println(p.x);
		p.method();
		System.out.println(c.x);
		c.method();
	}
}

class Parent18{
	int x = 100;
	
	void method() {
		System.out.println("부모");
	}
}

class Child18 extends Parent18{
	
}