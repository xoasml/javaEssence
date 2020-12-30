package example;

import java.util.StringJoiner;

public class Source14_StringEx4 {
	public static void main(String[] args) {
		String animals = "dog, cat, bear";
		String[] strArr = animals.split(", ");
		
		System.out.println(String.join("-", strArr));
		
		StringJoiner sj = new StringJoiner("/", "[", "]");
		for(String s : strArr) {
			sj.add(s);
		}
		System.out.println(sj);
		
	}
}
