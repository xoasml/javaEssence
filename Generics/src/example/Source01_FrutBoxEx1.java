package example;

import java.util.ArrayList;

class Fruit1               { public String toString() { return "Fruit1"; } }
class Apple1 extends Fruit1 { public String toString() { return "Apple1"; } }
class Grape1 extends Fruit1 { public String toString() { return "Grape1"; } }
class Toy                 { public String toString() { return "Toy";   } }


public class Source01_FrutBoxEx1 {
	public static void main(String[] args) {
		Box1<Fruit1> fruitBox1 = new Box1<>();
		Box1<Apple1> appleBox1 = new Box1<>();
		Box1<Toy> toyBox1 = new Box1<>();
//		Box1<Apple1> grapeBox1 = new Box1<Grape1>(); // 에러 타입 불일치
		
		fruitBox1.add(new Fruit1());
		fruitBox1.add(new Apple1()); // Ok. void add(Frit item)
		
		appleBox1.add(new Apple1());
		appleBox1.add(new Apple1());
//		appleBox1.add(new Toy());  // 에러. Box1<Apple1>에는 Apple1만 담을 수 있음
		
		toyBox1.add(new Toy());
//		toyBox1.add(new Apple1());  // 에러. Box1<Toy>에는 Toy만 담을 수 있음.
		
		System.out.println(fruitBox1);
		System.out.println(appleBox1);
		System.out.println(toyBox1);
	}
}

class Box1<T>{
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}