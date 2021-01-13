package memo;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Note819_ArraysStream {
	public static void main(String[] args) {
		Stream<String> strStream1 = Stream.of("a", "b", "c");
		
		String[] strArr = {"c", "b", "a"};
		
		Stream<String> strStream2 = Stream.of(strArr);
		Stream<String> strStream3 = Arrays.stream(strArr);
		Stream<String> strStream4 = Arrays.stream(strArr, 0, 1);
		
		strStream1.forEach(System.out::print);
		System.out.println();
		
		// int, long, doubble과 같은 기본형 배열을 소스로 하는 스트림
		IntStream intStream1 = IntStream.of(1, 2, 3, 4, 5);
		IntStream intStream2 = IntStream.of(new int[] {1, 2, 3, 4, 5});
		IntStream intStream3 = Arrays.stream(new int[] {1, 2, 3, 4, 5});
		IntStream intStream4 = Arrays.stream(new int[] {1, 2, 3, 4, 5}, 0 , 3);
		
		IntStream intStream5 = IntStream.range(0, 10);
		IntStream intStream6 = IntStream.rangeClosed(0, 10);
		
		intStream5.forEach(System.out::print);
		System.out.println();
		intStream6.forEach(System.out::print);
		
//		DoubleStream
//		LongStream
		
	}
}
