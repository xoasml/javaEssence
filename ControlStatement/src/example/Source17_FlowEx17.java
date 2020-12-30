package example;

import java.util.Scanner;

public class Source17_FlowEx17 {
	public static void main(String[] args) {
		System.out.print("*을 출력할 라인의 수를 입력하세요 >");
		
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		
		for(int i=1 ; i<=cnt ; i++) {
			System.out.printf("cnt: %-2d ", i);
			for(int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
