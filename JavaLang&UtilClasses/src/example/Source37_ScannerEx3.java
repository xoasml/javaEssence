package example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Source37_ScannerEx3 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("data3.txt"));
		int cnt = 0 ;
		int totalSum = 0;
		
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			int sum = 0;
			
			while(sc2.hasNextInt()) {
				sum += sc2.nextInt();
			}
			System.out.println(line + ", sum = " + sum);
			totalSum += sum;
			cnt++;
		}
		System.out.println("Line : " + cnt + " , Total : " + totalSum);
	}
}
