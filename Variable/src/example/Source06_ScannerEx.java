package example;

import java.util.*;	//Scanner를 사용하기 위해 임포트

public class Source06_ScannerEx {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리 정수를 입력하세요");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용 : "+ input);
		System.out.printf("num= %d%n", num);
		
	}
}
