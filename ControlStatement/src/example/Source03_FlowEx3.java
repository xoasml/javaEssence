package example;

import java.util.Scanner;

public class Source03_FlowEx3 {
	public static void main(String[] args) {
		System.out.print("숫자를 하나 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		int input = Integer.parseInt(tmp);
		
		if(input==0) {
			
			System.out.println("입력한 숫자는 0 입니다.");
			
		} else {
			
			System.out.println("입력한 숫자는 0이 아닙니다.");
			System.out.printf("입력한 숫자는 %d 입니다.", input);
			
		}
		
	}
}
