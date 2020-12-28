package example;

import java.util.StringTokenizer;

public class Source42_StringTokenizerEx5 {
	public static void main(String[] args) {
		String data = "100,,,200,300";
		
		String[] result = data.split(",");
		StringTokenizer st = new StringTokenizer(data, ",");
		
		
		
		System.out.print(String.join("|", result));
		System.out.println("개수 : " + result.length  + " ← split");
		
		int count = st.countTokens();
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + "|");
		}
		System.out.println("개수 : " + count  + " ← StringTokenizer");
		
	}
}
