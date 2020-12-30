package example;

public class Source33_FlowEx33 {
	public static void main(String[] args) {
		Loop1 :
		for(int i = 2; i <= 9 ; i++) {
			for(int j =1 ; j <= 9; j++) {
				if(j==5) {
					continue Loop1;
//					break Loop1;
//					continue;
//					break;
				}
				System.out.println( i +" * "+ j + "=" + i*j);
			}
		}
	}
}
