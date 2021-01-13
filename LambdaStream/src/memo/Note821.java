package memo;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Note821 {
	public static void main(String[] args) {
		Stream<Integer> evenStream = Stream.iterate(0, n->n+2);
		evenStream.limit(6).forEach(System.out::println);
		
		IntStream stream = Stream.generate(Math::random).mapToInt(Double::intValue);
		stream.limit(3).forEach(System.out::print);
	}
}
