package exemple;

import java.util.Arrays;

/*
 * 배열에 어떤 수가 몇개 저장되어 있는지 cnt
 */
public class Source11_ArrayEx11 {
	public static void main(String[] args) {
		int num[] = new int[10];
		int cnt[] = new int[10];
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = (int)(Math.random() * 10);
		}
		System.out.println(Arrays.toString(num));

		//내 코드
//		for(int i = 0 ; i< num.length ; i++) {
//			for(int j = 0; j<10 ; j++) {
//				if(num[i] == j) {
//					cnt[j]++;
//					break;
//				}
//			}
//		}
		
		// 모범 코드
		for(int i = 0 ; i< num.length ; i++) {
			cnt[num[i]] ++;
		}
		
		for(int i = 0 ; i < cnt.length ; i++) {
			System.out.println(i+"의 갯수 : " + cnt[i]);
		}
		
		
	}
}
