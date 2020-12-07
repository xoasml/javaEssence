package exemple;

public class Source01_ArrayEx1 {
	public static void main(String[] args) {
		int[] score = new int[5];
		int k =1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;	// socre[2] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score[4];	//int tmp = score[3] + socre[4];
		
		//for문으로 배열의 모든 요소를 출력
		for(int i = 0; i < 5; i++) {
			System.out.printf("score[%d] = %d%n",i , score[i]);
		}
		
		System.out.printf("tmp:%d%n", tmp);
		
		System.out.println(score[5]);	//score[]의 index를 벗어난 값
	}
}
