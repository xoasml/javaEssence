package example;

public class Source07_CharToCode {
	public static void main(String[] args) {
		char ch = 'A';		// char ch = 65;
		int code = (int)ch;	// ch에 저장된 값을 int 타입으로 변환
		
		System.out.printf("%c=%d (%#X) %n", ch, code, code);
		
		char hch = '가';	// char hch = 0xAC00;
		System.out.printf("%c=%d (%#X) %n", hch, (int)hch, (int)hch);
		
		char test = 0xAC00;
		char test2 = '\uAC00';
		
		System.out.println(test + " :: " + test2);
	}
}
