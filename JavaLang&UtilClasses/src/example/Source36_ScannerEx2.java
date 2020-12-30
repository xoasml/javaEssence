package example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Source36_ScannerEx2 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("data2.txt"));
		int sum = 0;
		int cnt = 0;
		
		while(scan.hasNext()) {
			sum += scan.nextInt();
			cnt++;
		}
		
		System.out.println("sum = " + sum);
		System.out.println("average = " + (double)sum/cnt);
	}
}
