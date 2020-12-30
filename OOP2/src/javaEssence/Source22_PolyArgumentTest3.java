package javaEssence;

import java.util.*;

class BuyerC extends Buyer21{
	Vector<Product21> item = new Vector<Product21>();
	
	@Override
	void buy(Product21 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}
		
		super.money -= p.price;
		super.bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+"을/를 구입하셨습니다다.");
	}
	
	void refund(Product21 p) {
		if(item.remove(p)) {
			super.money += p.price;
			super.bonusPoint -= p.bonusPoint;
			System.out.println(p+"을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품("+p+")이 없습니다.");
		}
	}
	
	@Override
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i=0 ; i<item.size() ; i++) {
			Product21 p = item.get(i); 
			sum += p.price;
			itemList += (i==0) ? ""+ p : ", "+ p;
		}
		
		System.out.println("구입하신 물품의 총금액은 "+ sum + "만원입니다.");
		System.out.println("구입하신 제품은 "+ itemList + "입니다.");
	}
	
}

public class Source22_PolyArgumentTest3 {
	public static void main(String[] args) {
		BuyerC b = new BuyerC();
		Tv21 tv = new Tv21();
		Computer21 com = new Computer21();
		Audio21 audio = new Audio21();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.refund(com);
		b.summary();
	}
}
