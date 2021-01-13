package memo;

import java.util.stream.Stream;

/*
 * 정렬 - sorted()
 * 말 그대로 정렬을 하기 위해서는 sorted()를 사용 하면 된다.
 */
public class Note824 {
	public static void main(String[] args) {
		Stream<String> st = Stream.of("BB", "b", "h", "H", "p", "O", "U", "O", "A", "a", "c", "C");
		st.sorted().forEach(System.out::print);
		
	}
}
