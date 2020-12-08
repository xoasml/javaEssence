package example;

import java.util.Arrays;
import java.util.Scanner;

/* 5x5 빙고판 만들기 */
public class Source21_MultiArrEx2 {
	public static void main(String[] args) {
		final int SIZE = 5;
		int x = 0, y = 0, num=0;
		
		int[][] bingo = new int[SIZE][SIZE];
		Scanner scan = new Scanner(System.in);
		
		// 배열에 1~25 숫자 넣기
		for(int i = 0 ; i<SIZE ; i++) {
			for(int e = 0 ; e<SIZE ; e++) {
				bingo[i][e] = i*SIZE+e+1;
			}
		}
		
		// 넣은 숫자 섞기
		for(int i=0 ; i<SIZE ; i++) {
			for(int e=0 ; e<SIZE ; e++) {
				x = (int)(Math.random()*SIZE);
				y = (int)(Math.random()*SIZE);
				
				//bingo[i][j]와 임의로 선택된 값(bingo[x][y])을 바꾼다.
				int tmp = bingo[i][e];
				bingo[i][e] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do {
			
			for(int i=0 ; i<SIZE ; i++) {
				for(int e=0 ; e<SIZE ; e++) {
					System.out.printf("%3d", bingo[i][e]);
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.println("1~25의 숫자를 입력하세요. (종료:0)");
			String tmp = scan.nextLine();
			num = Integer.parseInt(tmp);
			
			outer:
			for(int i=0 ; i<SIZE ; i++) {
				for(int e=0 ; e<SIZE ; e++) {
					if(bingo[e][i] == num) {
						bingo[e][i] = 0;
						break outer;
					}
				}
			}
			
		}while(num !=0);
		
		
		
		
		/*내가 짠 코드*/
//		// 배열에 1~25 숫자 넣기
//		for(int i = 0 ; i<bingo.length ; i++) {
//			for(int e = 0 ; e<bingo[i].length ; e++) {
//				bingo[i][e] = ++num;
//			}
//		}
//		
//		// 넣은 숫자 섞기
//		for(int i = 0 ; i < num ; i++) {
//			x = (int)(Math.random()*5);
//			y = (int)(Math.random()*5);
//			
//			int tmp = bingo[0][0];
//			bingo[0][0] = bingo[x][y];
//			bingo[x][y] = tmp;
//		}
//		
//		for(int i = 0 ; i<bingo.length ; i++) System.out.println(Arrays.toString(bingo[i]));
//		
//		outer:
//		while(true) {
//			System.out.println("1~25의 숫자중 원하는 숫자를 입력하세요. (종료:0)>");
//			String input = scan.nextLine();
//			
//			
//			if(input == null || input.equals("")) continue;
//			
//			/* 숫자 외의 문자 넣는지 채크 */
//			char[] typeCheckArr = input.toCharArray();
//			for(char value : typeCheckArr) {
//				if(value < '0' || value > '9') {
//					System.out.println("!!Warning!! 숫자 외의 문자를 넣었습니다.");
//					continue outer;
//				}
//			}
//			int target = Integer.parseInt(input);
//			
//			if(target == 0) break;
//			
//			/* 숫자 범위 채크 */
//			if(target < 1 || target > 25) {
//				System.out.println("!!Warning!! 1에서 25사이의 숫자만 입력 가능합니다.");
//				continue;
//			}
//			
//			inner:
//			for(int i = 0 ; i<bingo.length ; i++) {
//				for(int e = 0 ; e<bingo[i].length ; e++) {
//					if(bingo[i][e] == target) {
//						bingo[i][e] = 0;
//						break inner;
//					}
//				}
//			}
//			
//			for(int i = 0 ; i<bingo.length ; i++) System.out.println(Arrays.toString(bingo[i]));
//		}
	}
}
