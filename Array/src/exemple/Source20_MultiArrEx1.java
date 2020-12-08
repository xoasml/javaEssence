package exemple;

import java.util.Arrays;
import java.util.Scanner;

/*원하는 위치에 별(*) 찍기*/
public class Source20_MultiArrEx1 {
	public static void main(String[] args) {
		final int SIZE = 10;
		int x= 0, y=0;
		
		char[][] board = new char[SIZE][SIZE];
		
		/* 책에 적힌 코드 */
		byte[][] shipBoard = {
				// 1  2  3  4  5  6  7  8  9
				  {0, 0, 0, 0, 0, 0, 1, 0, 0} // 1
				 ,{1, 1, 1, 1, 0, 0, 1, 0, 0} // 2
				 ,{0, 0, 0, 0, 0, 0, 1, 0, 0} // 3
				 ,{0, 0, 0, 0, 0, 0, 1, 0, 0} // 4
				 ,{0, 0, 0, 0, 0, 0, 0, 0, 0} // 5
				 ,{1, 1, 0, 1, 0, 0, 0, 0, 0} // 6
				 ,{0, 0, 0, 1, 0, 0, 0, 0, 0} // 7
				 ,{0, 0, 0, 1, 0, 0, 0, 0, 0} // 8
				 ,{0, 0, 0, 0, 0, 1, 1, 1, 0} // 9
			};
		
		// 1행에 행번호를, 1열에 열번호를 저장한다.
		for(int i = 0 ; i<SIZE ; i++) {
			board[i][0] = board[0][i] = (char)(i+'0');	// 난 왜 2차 포문만 생각했을까.. ㅋㅋ
		}
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("좌표를 입력하세요. (종료는 00)>");
			String input = scan.nextLine();	// 화면에서 입력받은 값을 input에 저장
			
			if(input.length() == 2) {
				x = input.charAt(0) -'0';
				y = input.charAt(1) -'0';
				
				if(x == 0 && y == 0) break;	//x,y가 모두 0이면 종료
			}
			
			if(input.length() != 2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X';
			
			
			for(int i = 0 ; i<board.length ; i++) {
				System.out.println(Arrays.toString(board[i]));
			}
			
		}
		
		/* 내 코드 */
//		for(int i = 0 ; i < board.length ; i++ ) {
//			char num = (char)(i+48);
//			board[i][0] = num;
//			
//			if(i == 0) {
//				for(int e = 0; e<board[0].length ; e++) {
//					char num2 = (char)(e+48);
//					board[0][e] = num2;
//				}
//			}
//			
//		}
//		
//		Scanner scan = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("별찍을곳 선택하세요(종료:00) : >");
//			String target = scan.nextLine();
//			
//			if(target.endsWith("00")) break;
//			if(target.length() != 2) {
//				System.out.println("2자리만 가능");
//				continue;
//			}
//			
//			x = target.charAt(0) - '0';
//			y = target.charAt(1) - '0';
//			
//			board[x][y] = '*';
//			
//			for(int i = 0 ; i<board.length ; i++) {
//				System.out.println(Arrays.toString(board[i]));
//			}
//		}
		
		
		
	}
}
