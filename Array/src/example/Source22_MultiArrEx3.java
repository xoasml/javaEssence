package example;

import java.util.Arrays;

/* 행렬의 곱셈 (Matrix)*/
public class Source22_MultiArrEx3 {
	public static void main(String[] args) {
		int[][]  m1 = {
			 {1, 2, 3}
			,{4, 5, 6}
		};
		
		int[][] m2 = {
				 {1, 2}
				,{3, 4}
				,{5, 6}
		};
		
		int[][] m3 = new int[2][2];
		
		
		for(int i=0 ; i<2 ; i++) {
			for(int e=0 ; e<2 ; e++) {
				for(int k=0 ; k<3 ; k++) {
					m3[i][e] += m1[i][k] * m2[k][e]; 
				}
			}
		}
		
		
		for(int arr[] : m3) {
			System.out.println(Arrays.toString(arr));
		}
		
		
	}
}
