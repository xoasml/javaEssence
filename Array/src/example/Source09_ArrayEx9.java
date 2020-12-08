package example;

import java.util.Arrays;

/*
 * 임의의 값으로 배열 채우기
 */
public class Source09_ArrayEx9 {
	public static void main(String[] args) {
		int[] code = {-4, -1, 3, 6, 11};
		int[] arr = new int[10];
		
		int ranNum;
		for(int i = 0; i < 10 ; i++) {
			ranNum = (int)(Math.random()*code.length);
			arr[i] = code[ranNum];
		}
		System.out.println(Arrays.toString(arr));
	}
}
