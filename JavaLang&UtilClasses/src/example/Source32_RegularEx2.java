package example;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Source32_RegularEx2 {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "c", "cA", "ca", "co", "c.", "c0", "c#", "car", "combat", "count", "date", "disc"};
		
		String[] pattern = {".*", "c[a-z]*", "c[a-z]", "c[a-zA-Z]"
						   ,"c[a-zA-Z0-9]", "c.*", "c\\.", "c\\w", "c\\d"
						   ,"c.*t", "[b|c].*", ".a.*", ".*a.+", "[b|c].{2}"}; 
		
		
		for(int x=0; x < pattern.length; x++) {
			Pattern p = Pattern.compile(pattern[x]);
			StringJoiner sj = new StringJoiner(", ");
			System.out.printf("Pattern : %12s / 결과 : ", pattern[x]);
			for(int i = 0 ; i < data.length ; i++) {
				Matcher m = p.matcher(data[i]);
				if(m.matches()) {
					sj.add(data[i]);
				}
			}
			System.out.println(sj);
			System.out.println();
		}
		
	}
}
