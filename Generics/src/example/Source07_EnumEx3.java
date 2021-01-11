package example;

enum Transpotation{
	BUS(100)	  { int fare(int dstance) { return dstance*BASIC_FARE; } },
	TRAIN(150)	  { int fare(int dstance) { return dstance*BASIC_FARE; } },
	SHIP(100)	  { int fare(int dstance) { return dstance*BASIC_FARE; } },
	AIRPLANE(300) { int fare(int dstance) { return dstance*BASIC_FARE; } };
	
	protected final int BASIC_FARE; // protected로 해야 상수에서 접근 가능
	
	private Transpotation(int basic_fare) {
		BASIC_FARE = basic_fare;
	}
	
	public int getBasicFare() {return BASIC_FARE; }
	
	abstract int fare(int dstance);
	
}

public class Source07_EnumEx3 {
	public static void main(String[] args) {
		System.out.println("bus fare="+Transpotation.BUS.fare(100));
		System.out.println("bus fare="+Transpotation.TRAIN.fare(100));
		System.out.println("bus fare="+Transpotation.SHIP.fare(100));
		System.out.println("bus fare="+Transpotation.AIRPLANE.fare(100));
	}
}
