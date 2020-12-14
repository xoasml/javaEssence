package javaEssence;

class Product{
	int price;		// 제품 가격
	int bonusPoint;	// 제품구매 시 제공하는 보너스 점수
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0);	// 보너스점수는 제품가격의 10%
	}
}

class Tv1 extends Product{
	Tv1() {
		super(100);	// Tv의 가격을 100만원으로 한다.
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer{	// 고객, 물건을 사는 사람
	int money = 1000;	// 소유금액
	int bonusPoint = 0;	// 보너스점수
	Product[] item = new Product[10];
	int i = 0 ;
	
	void buy(Product p) {
		if(this.money < p.price) {
			System.out.println("잔액이 부족하여 "+p.toString()+"을 살수 없습니다.");
		}
		
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p.toString()+"을 구매하셨습니다.");
	}
	
}

public class Source20_PolyArgumentTest1 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("남은 돈 : " + b.money);
		System.out.println("포인트 : " + b.bonusPoint);
	}
}
