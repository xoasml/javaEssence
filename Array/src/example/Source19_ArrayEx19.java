package example;

public class Source19_ArrayEx19 {
	public static void main(String[] args) {
		int[][] score = {
				 { 100, 100 ,100}
				,{ 20, 20 ,20}
				,{ 30, 30 ,30}
				,{ 40, 40 ,40}
				,{ 50, 50 ,50}
			};
		
		int kor = 0, math = 0 , eng = 0;
		
		/* 책에 적힌 코드 */
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("==================================");
		
		for(int i=0 ; i<score.length ; i++) {
			int   sum = 0;		// 개인별 총점
			float avg = 0.0f;	// 개인별 평균
			
			kor  += score[i][0];
			math += score[i][1];
			eng  += score[i][2];
			System.out.printf("%3d", i+1);
			
			for(int j = 0 ; j<score[i].length ; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			
			avg = sum/(float)score[i].length;	//평균계산
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("==================================");
		System.out.printf("총점:%3d %4d %4d%n", kor, math, eng);
		
		/* 내가 짠 코드*/
//		System.out.println("번호  국어  영어  수학  총점  평균");
//		System.out.println("==================================");
//		int num = 1;
//		
//		for(int[] tmp : score) {
//			int total = 0;
//			
//			kor  += tmp[0];
//			math += tmp[1];
//			eng  += tmp[2];
//			
//			System.out.printf("%3d  ", num);
//				
//			for(int i : tmp) {
//				System.out.printf("%5d ", i);
//				total += i;
//			}
//			
//			System.out.printf("%5d  %5.1f", total, (double)total/tmp.length);
//			++num;
//			System.out.println();
//		}
//		
//		System.out.printf("총점:%5d %5d %5d", kor, math, eng);
		
	}
}
