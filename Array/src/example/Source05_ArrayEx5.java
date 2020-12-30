package example;
/*
 * 총합과 평균 구하기
 */
public class Source05_ArrayEx5 {
	public static void main(String[] args) {
		int sum = 0;
		float avg = 0f;
		int score[] = {100, 88, 100, 100, 90};
		
		for(int i = 0; i < score.length ; i++) {
			sum += score[i];
		}
		avg = (float)sum / score.length;
		
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
