package example;
/*
 * 섞기(shuffle)
 * 배열 요소의 순서를 반복해서 바꾼다.
 */

import java.util.Arrays;

public class Source07_ArrayEx7 {
	public static void main(String[] args) {
		int numArr[] = new int[10];
		
		for(int i = 0 ; i<numArr.length ; i++) {
			numArr[i] = i;
		}
		System.out.println("섞기 전 : " + Arrays.toString(numArr));
		
		for(int i = 0; i<numArr.length ; i++) {
			int n = (int)(Math.random()*numArr.length);
			int tmp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println("섞은 후 : " + Arrays.toString(numArr));
	}
}
