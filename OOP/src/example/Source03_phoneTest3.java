package example;

class Source03_phoneTest3 {
	public static void main(String[] args) {
		SmartPhone p1 = new SmartPhone();
		SmartPhone p2 = new SmartPhone();
		
		System.out.println("p1의 볼륨은" + p1.volume +"입니다.");
		System.out.println("p2의 볼륨은" + p2.volume +"입니다.");
		
		p2 = p1;	//p1의 주소를 p2에 저장한다
		
		p1.volume = 7;
		System.out.println("p1의 볼륨을 7로 변경 했습니다.");
		
		System.out.println("p1의 볼륨은" + p1.volume +"입니다.");
		System.out.println("p2의 볼륨은" + p2.volume +"입니다.");
	}
}
