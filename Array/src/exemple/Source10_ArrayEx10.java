package exemple;

import java.util.Arrays;

/*
 * 임의의 숫자 정렬하기
 */
public class Source10_ArrayEx10 {
	public static void main(String[] args) {
		int[] numArr = new int[100];
		int tmp;
		
		for(int i = 0 ; i < numArr.length ; i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		
		/*내 코드*/
//		int[] numArr2 = new int[numArr.length];
//		System.arraycopy(numArr, 0, numArr2, 0, numArr.length);
//		for(int i = 0 ; i<numArr2.length ; i++) {
//			boolean changed = false;
//			for(int e = i ; e<numArr2.length; e++) {
//				tmp = numArr2[i];
//				if(tmp > numArr2[e]) {
//					numArr2[i] = numArr2[e];	//
//					numArr2[e] = tmp;
//					
//					changed = true;
//				}
//			}
//			if(!changed) break;
//		}
//		System.out.println(Arrays.toString(numArr2));
//		System.out.println("==================");
//		System.out.println("==================");
		
		/*더 좋은 코드*/
		for(int i = 0 ; i< numArr.length-1 ; i++) {
			boolean changed = false;
			
			for(int j=0; j < numArr.length-1-i ; j++) {
				if(numArr[j] > numArr[j+1]) {
					tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
					changed = true;
				}
			}
			if(!changed) break;
			
		}
		System.out.println(Arrays.toString(numArr));
	}
}
