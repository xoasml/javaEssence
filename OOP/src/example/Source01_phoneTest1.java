package example;

class SmartPhone {
	//SmartPhone 속성(멤버변수)
	String color;	//색상
	boolean power;	// 전원상태(on/off)
	int volume;		// 볼륨
	
	//SmartPhone 기능(메서드)
	void power()	  { power = !power; }
	void volumeUp()   { ++volume; }
	void volumeDown() { --volume; }
}

class Source01_phoneTest1 {
	public static void main(String[] args) {
		SmartPhone p;
		p = new SmartPhone();
		
		p.volume = 7;
		p.volumeUp();
		p.volumeUp();
		
		System.out.printf("스마트폰 볼륨은 %d 입니다.", p.volume);
	}
}


