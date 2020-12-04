package exemple;

public class Source22_FlowEx22 {
	public static void main(String[] args) {
		int[] arr  = new int[]{10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		for(int tmp : arr) {
			System.out.print(tmp+" ");
			sum += tmp;
		}
		
		System.out.println();
		System.out.println(sum);
	}
}
