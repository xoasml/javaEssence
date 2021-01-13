package memo;

import java.util.Arrays;
import java.util.stream.Stream;

public class Note822 {
	public static void main(String[] args) {
		Stream emptyStream = Stream.empty();
		long count = emptyStream.count();
		System.out.println(count);
		
		String[] str1 = {"123", "456", "789"};
		String[] str2 = {"abd", "def", "ghi"};
		
		Stream strs1 = Stream.of(str1);
		Stream strs2 = Arrays.stream(str2);
		
		Stream strs3 = Stream.concat(strs1, strs2);
		strs3.forEach(System.out::println);
	}
}
