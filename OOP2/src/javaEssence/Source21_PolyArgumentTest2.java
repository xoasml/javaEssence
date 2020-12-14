package javaEssence;

class Product21{
	int price;
	int bonusPoint;
	
	Product21(int price){
		this.price = price;
		this.bonusPoint = (int)(price / 10.0);
	}
	
	Product21(){
		price = 0;
		bonusPoint = 0;
	}
}

class Tv21 extends Product21{
	Tv21(){super(100);}
	public String toString() {return "Tv"; }
}

class Computer21 extends Product21{
	Computer21(){super(200);}
	public String toString() {return "Computer"; }
}

class Audio21 extends Product21{
	Audio21() {super(50);}
	public String toString() {return "Audio";}
}

class Buyer21{
	int money = 1000;
	int bonusPoint = 0;
	Product21[] item = new Product21[10];
	int i = 0;
	
	void buy(Product21 p) {
		if(money < p.price){
			System.out.println("잔액이 부족하여 "+p+"을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0 ; i<item.length ; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] +", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum +"만원입니다.");
		System.out.println("구입하신 제품은 "+ itemList + "입니다.");
	}
}

public class Source21_PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer21 b = new Buyer21();
		
		b.buy(new Tv21());
		b.buy(new Computer21());
		b.buy(new Audio21());
		b.summary();
	}
}
