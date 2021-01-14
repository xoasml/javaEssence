package memo;

import java.util.Arrays;
import java.util.stream.Stream;

public class Note833 {
	public static void main(String[] args) {
		String[] lineArr = {
				"Belive or not It is true",
				"Do or not There is no try"
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		Stream<String> strArrStream = lineStream.flatMap(line->Stream.of(line.split(" +")));
		strArrStream.forEach(System.out::println);
		
		Stream<String> str1 = Stream.of("abc", "ddd", "123");
		Stream<String> str2 = Stream.of("abc", "ddd", "123");
		
		Stream<Stream<String>> str3 = Stream.of(str1, str2);
		Stream<String> strStream = str3.map(s -> s.toArray(String[]::new)).flatMap(Arrays::stream);
		strStream.forEach(System.out::println);
		
	}
}
