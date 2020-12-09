package example;

public class Source04_phoneTest4 {
	public static void main(String[] args) {
		SmartPhone[] pArr = new SmartPhone[3];
		
		for(int i=0 ; i<pArr.length ; i++) {
			pArr[i] = new SmartPhone();
			pArr[i].volume = i+10;
		}
		
		for(int i=0 ; i<pArr.length ; i++) {
			pArr[i].volumeUp();
			System.out.println("pArr["+i+"]의 볼륨은 " + pArr[i].volume + "입니다.");
		}
		
	}
}
