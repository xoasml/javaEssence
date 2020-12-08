package example;

import java.util.Scanner;

public class Source08_FlowEx8 {
	public static void main(String[] args) {
		System.out.println("당신의 주민번호를 입력하세요. (011231-111222) >" );
		
		Scanner scan = new Scanner(System.in);
		String regNo = scan.nextLine();
		char input = regNo.charAt(7);
		
		switch(input) {
			case '1' : case '3' :
				System.out.println("당신은 남자입니다.");
				break;
			case '2' : case '4' :
				System.out.println("당신은 여자입니다.");
				break;
			default :
				System.out.println("유효하지 않은 주민등록번호입니다.");
		}
	}
}
