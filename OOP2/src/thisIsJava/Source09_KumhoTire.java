package thisIsJava;

public class Source09_KumhoTire extends Source09_Tire{
	//필드
	//생성자
	public Source09_KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "KumhoTire 수명 : " 
					+ (maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("*** "+ location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}

