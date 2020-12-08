package exemple;

public class Source18_ArrayEx18 {
	public static void main(String[] args) {
		int[][] score = {
							 { 100, 100 ,100}
							,{ 20, 20 ,20}
							,{ 30, 30 ,30}
							,{ 40, 40 ,40}
						};
		
		int sum = 0;
		
		for(int i = 0 ; i< score.length ; i++) {
			for(int e = 0 ; e<score[i].length ; e++) {
				System.out.printf("socre[%d][%d] = %d%n", i ,e ,score[i][e]);
			}
		}
		
		for(int[] i : score) {
			for(int e : i) {
				sum += e;
			}
		}
		
		System.out.println(String.format("총 합은 : %d", sum));
		
	}
}
