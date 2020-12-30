package example;

import java.util.Scanner;

/* 단어 맞추기 */
public class Source23_MultiArrEx4 {
	public static void main(String[] args) {
		String[][] words = {
				 {"chair", "의자"}
				,{"computer", "컴퓨터"}
				,{"integer", "정수"}
		};
		
		Scanner scan = new Scanner(System.in);
		
		/*책 코드*/
		for(int i=0 ; i<words.length ; i++) {
			System.out.printf("Q%d. \'%s\'의 뜻은?", i+1, words[i][0]);
			
			String tmp = scan.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답!%n", words[i][1]);
			} else {
				System.out.printf("오답! 답은 %s입니다.%n", words[i][1]);
			}
			
		}
		
		/* 내 코드 */
//		String input;
//		outer:
//		while(true) {
//			int examNum = (int)(Math.random()*3);
//			
//			while(true) {
//				System.out.printf("\'%s\' (종료:\'end\'): ", words[examNum][0]);
//				input = scan.nextLine();
//				
//				if(input.equals("end")) break outer;
//				
//				if(input.equals(words[examNum][1])) {
//					System.out.println("정답!");
//					break;
//					
//				} else {
//					System.out.println("오답! 다시 시도하세요");
//					
//				}
//			}
//		}
		
		
	}
}
