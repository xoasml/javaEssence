package example;

import java.util.Scanner;

public class Source28_FlowEx28 {
	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100) + 1;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("1과 100 사이의 정수를 입력하세요.> ");
			input = Integer.parseInt(scan.nextLine());
			
			if(answer > input) {
				System.out.println("입력한 값보다 정답이 더 큽니다.");
			} else if(answer < input) {
				System.out.println("입력한 값보다 정답이 더 작습니다.");
			}
		} while(input != answer);
		System.out.println("정담 : "+ answer);
	}
}
