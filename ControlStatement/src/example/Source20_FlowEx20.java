package example;

public class Source20_FlowEx20 {
	public static void main(String[] args) {
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <=5 ; j++) {
				System.out.print(String.format("[%d, %d]", i,j));
			}
			System.out.println();
		}
	}
}
