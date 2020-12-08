package example;

import java.util.Arrays;
/*
 * 이미 만들어진 5칸의 배열을 10칸으로 늘리고싶다면?
 * 10칸짜리 배열을 만든 후
 * 5칸짜리 배열의 데이터를 10칸짜리 배열에 입력 후
 * fiveArr = tenArr;
 * 해주면 된다.
 */
public class Source03_ArrayEx3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		// 배열 arr에 1~5를 저장한다.
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println("[변경전]");
		System.out.println("arr.length : "+arr.length);
		for(int i = 0; i < arr.length ; i++) {
			System.out.println("arr["+i+"] : " + arr[i]);
		}
		
		int[] tmp = new int[arr.length*2];
		
		//배열 arr에 저장된 값들을 배열 tmp에 저장한다.
		for(int i = 0 ; i < arr.length ; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp;
		
		System.out.println("arr.length : "+ arr.length);
		for(int i = 0; i < arr.length ; i++) {
			System.out.println("arr["+i+"] : " + arr[i]);
		}
	}
}
