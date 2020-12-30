package example;

import java.util.StringTokenizer;

public class Source38_StringTokenizerEx1 {
	public static void main(String[] args) {
		String source = "1,2,3,4,5";
		StringTokenizer st = new StringTokenizer(source, ",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
