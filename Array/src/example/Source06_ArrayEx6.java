package example;
/*
 * 최대값 최소값 구하기
 * 배열의 요소 중에서 제일 큰 값과 제일 작은 값을 찾는다.
 */
public class Source06_ArrayEx6 {
	public static void main(String[] args) {
		int score[] = {79, 88, 91, 33, 100, 55, 95};
		int max = score[0];
		int min = score[0];
		
		for(int i = 0 ; i<score.length ; i++) {
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.printf("최대 : %d, 최소 : %d%n", max, min);
	}
}
