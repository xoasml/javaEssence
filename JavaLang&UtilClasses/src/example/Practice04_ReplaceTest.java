package example;

import java.util.Arrays;

public class Practice04_ReplaceTest {
	public static void main(String[] args) {
		String ab = "AABBAABB";
		String r = ab.replaceFirst("BB", "bb");
		String r2 = ab.replaceFirst("[B]", "c");
		
		
		System.out.println(r);
		System.out.println(r2);
		
		String animals = "dog,cat,bear,고동우";
		String[] arr = animals.split(",", 3);
		
		System.out.println(Arrays.toString(arr));
		
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);
		System.out.println(date);
		
		System.out.println(String.join("-", "zzz", "asd"));
		
	}
}
