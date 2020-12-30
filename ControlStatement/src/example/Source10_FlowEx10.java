package example;

import java.util.Scanner;

public class Source10_FlowEx10 {
	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' ';
		
		System.out.print("당신의 점수를 입력하세요. (1~100)>  ");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		switch (score / 10) {
			case 10 : case 9 :
				grade = 'A';
				break;
			case 8 :
				grade = 'B';
				break;
			case 7 :
				grade = 'C';
				break;
			default :
				grade = 'F';
		}
		
		System.out.println(String.format("당신의 점수는 %d, 등급은 %c 입니다.", score, grade));
		
	}
}
