package example;

import java.util.Arrays;
import java.util.Random;

public class Source29_RandomEx3 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print(getRand(10, 20) + " ");
		}
		
		System.out.println();
		
		int[] result = fillRand(10, new int[] {2, 3, 7, 5});
		System.out.println(Arrays.toString(result));
	}
	
	
	public static int[] fillRand(int length, int... data) {
		int arr[] = new int[length];
		for(int i = 0; i < length; i++) {
			arr[i] = data[getRand(0, data.length-1)];
		}
		return arr;
	}
	
	public static int getRand(int from, int to) {
		return (int)(Math.random() * (Math.abs(to-from)+1)) + Math.min(from, to);
//		return new Random().nextInt(Math.abs(to-from)) + 1 + Math.min(from, to); 
	}
	
}
