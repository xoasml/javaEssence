package exemple;

import java.util.Scanner;

public class Source04_FlowEx4 {
	public static void main(String[] args) {
		int score = 0 ;		// 점수를 저장하기 위한 변수
		char grade = ' ';	// 학점을 저장학 위한 변수. 공백으로 초기화 한다.
		
		System.out.print("점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
		
	}
}
