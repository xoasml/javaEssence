package exemple;

import java.util.Scanner;

public class Source07_FlowEx7 {
	public static void main(String[] args) {
		System.out.print("가위(1), 바위(2), 보(3) 중 하나 입력 >");
		
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		int com = (int) (Math.random() * 3) + 1;	// 1, 2, 3중 하나가 com에 저장
		
		System.out.println("당신은 " + user + "입니다.");
		System.out.println("컴은 " + com + "입니다.");
		
		switch (user - com) {
			case 2 : case -1 :
				System.out.println("당신이 졌소");
				break;
				
			case 1 : case -2 :
				System.out.println("당신이 이겼소");
				break;
			
			default :
				System.out.println("비겼소");
		}
	}
}
