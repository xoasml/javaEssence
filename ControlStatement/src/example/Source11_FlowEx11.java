package example;

import java.util.Scanner;

public class Source11_FlowEx11 {
	public static void main(String[] args) {
		System.out.println("당신의 주민등록번호를 입력 하세요 > ");
		Scanner scan = new Scanner(System.in);
		
		String regNo = scan.nextLine();
		char gender = regNo.charAt(7);
		
		switch (gender) {
			case '1': case '3':
				switch(gender) {
					case '1':
						System.out.println("당신은 2000년 이전 출생한 남자");
						break;
					case '3':
						System.out.println("당신은 2000년 이후 출생한 남자");
				}
				break;
			case '2': case '4':
				switch(gender) {
					case '2':
						System.out.println("당신은 2000년 이전 출생한 여자");
					break;
					case '4':
						System.out.println("당신은 2000년 이후 출생한 여자");
				}
				break;
			default:
				break;
		}
	}
}
