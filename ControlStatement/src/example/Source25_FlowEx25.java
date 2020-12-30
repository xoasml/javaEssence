package example;

import java.util.Scanner;

public class Source25_FlowEx25 {
	public static void main(String[] args) {
		int num = 0 , sum = 0;
		System.out.print("숫자를 입력하세요. (예:12345) > ");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();	// 화면을 통해 입력받은 내용을 tmp에 저장
		num = Integer.parseInt(tmp);
		
		while(num != 0) {
			// num을 10으로 나눈 나머지를 sum에 더함
			
			sum += num%10;		//sum = sum + num % 10;
			
			System.out.printf("sum=%3d num=%d, %d%n", sum, num, num%10);
			
			num /= 10;
		}
	}
}
