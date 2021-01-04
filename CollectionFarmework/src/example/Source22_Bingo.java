package example;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Source22_Bingo {
	public static void main(String[] args) {
//		Set set = new HashSet();
		Set set = new LinkedHashSet();
		int[][] board = new int[5][5];
		
		for(int i=0 ; set.size() < 25 ; i++) {
			set.add((int)(Math.random()*50) + 1+"");
		}
		
		Iterator it = set.iterator();
		
		for(int i = 0 ; i <board.length ; i++) {
			for(int e = 0 ; e < board[i].length ; e++) {
				board[i][e] = Integer.parseInt((String) it.next());
				System.out.print((board[i][e] < 10 ? "  " : " " ) + board[i][e]);
			}
			System.out.println();
		}
	}
}
