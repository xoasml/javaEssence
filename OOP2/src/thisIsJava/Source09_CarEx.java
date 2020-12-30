package thisIsJava;

public class Source09_CarEx {
	public static void main(String[] args) {
		
		Source09_Car car = new Source09_Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1: 
				System.out.println("왼쪽앞 HankookTire 교체");
				car.fLTire = new Source09_HankookTire("왼쪽앞", 15);
				break;
			case 2:
				System.out.println("오른쪽앞 KumhoTire 교체");
				car.fRTire = new Source09_KumhoTire("오른쪽앞", 13);
				break;
			case 3:
				System.out.println("왼쪽뒤 HankookTire 교체");
				car.bLTire = new Source09_HankookTire("왼쪽뒤", 14);
				break;
			case 4:
				System.out.println("왼쪽앞 KumhoTire 교체");
				car.bRTire = new Source09_KumhoTire("오른쪽뒤", 17);
				break;
			}
			System.out.println("-------------------------------");
		}
	}
}
