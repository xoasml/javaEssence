package Exemple;

public class Source06_OperatorEx6 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		
//		byte c = a + b; (+) 연산자가 변수 a와 b를 int형으로 캐스팅해서 byte변수 c에 대입될때 에러 발생 
		byte c = (byte)(a + b); // int형은 4byte byte형은 1byte이므로 따로 형변환(casting)을 명시해줘야 된다.
		System.out.println(c);
	}
}
