package example;

class Source02_phoneTest2 {
	public static void main(String[] args) {
		SmartPhone p1 = new SmartPhone();
		SmartPhone p2 = new SmartPhone();
		
		System.out.printf("p1의 volume값은 %d 입니다.%n", p1.volume);
		System.out.printf("p2의 volume값은 %d 입니다.%n", p2.volume);
		
		p1.volume = 7;
		System.out.println("p1의 volume값을 7로 변경하였습니다.");
		System.out.printf("p1의 volume값은 %d 입니다.%n", p1.volume);
		System.out.printf("p2의 volume값은 %d 입니다.%n", p2.volume);
	}
}