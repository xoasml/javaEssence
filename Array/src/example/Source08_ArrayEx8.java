package example;

import java.util.Arrays;

/*
 * 로또 만들기
 * 숫자 1 ~ 45
 */
public class Source08_ArrayEx8 {
	public static void main(String[] args) {
		int[] ball = new int[45];
		int tmp, ranNum;
		
		for(int i = 0 ; i< ball.length; i++) {
			ball[i] = i+1;
		}
		for(int i = 0 ; i<6 ; i++) {
			ranNum = (int)(Math.random()*45);
			tmp = ball[i];
			ball[i] = ball[ranNum];
			ball[ranNum] = tmp;
		}
		
		for(int i = 0 ; i < 6 ; i++) {
			System.out.println(String.format("ball[%d] : %d",i+1 , ball[i]));
		}
		
	}
}
