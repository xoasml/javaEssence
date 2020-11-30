package Exemple;

/*
 * System.out.println() : System.out.printf()
 * 지금 까지는 println()을 사용해 왔다 
 * println()은 변수의 값을 그대로 출력하기 때문에 
 * 16진수나 8진수등의 데이터를 출력해줄수가 없음 
 * 이때는 printf()사용 하여 출력하면 됨
 * */

public class Source04_PrintfEx {
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;	// long big = 100000000000L; 과 동일
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010;  //  8진수 10, 10진수로는 8
		int hexNum = 0x10; // 16진수 10, 10진수로는 16
		int binNum = 0b10; //  2진수 10, 10진수로는 2
		
		// 줄바꿈 시 %n 대신 \n을 사용해도 되지만 OS마다 줄바꿈 문자가 다를 수 있어 %n을 사용하는 것이 더 안전
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		
		// 지시자 %d는 정수를 출력할때 사용 : 
		// %5d 처럼 숫자를 넣으면 출력될 값이 차지할 공간을 정할수 있다.
		System.out.printf("finger=[%5d]%n", finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);	// '#'은 접두사(16진수 0x 8진수 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", binNum, binNum);
		// 10진수를 2진수로 출력해주는 지시자는 없기 떄문에 Integer.toBinaryString()를 사용해야 한다.
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);	 
	}
}
