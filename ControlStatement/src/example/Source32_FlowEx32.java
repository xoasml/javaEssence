package example;

import java.util.Scanner;

public class Source32_FlowEx32 {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");
			
			String tmp = scan.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(menu > 3 || 1 > menu ) {
				System.out.println("잘못 선택하셨슴다.");
				continue;
			}
			System.out.println("선택하신 메뉴는"+ menu +"입니다.");
		}
	}
}
