package example;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Source13_StreamEx5 {
	public static void main(String[] args) {
		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};
		
		Stream.of(strArr).forEach(System.out::println);
		
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length() == 0); // noneMatch 일치하는게 없냐?? 없으면 true
		System.out.println("noEmptyStr = " + noEmptyStr);
		
		Optional<String> sWord = Stream.of(strArr).filter(s->s.charAt(0) =='s').findFirst();
		System.out.println("sWord = " + sWord.get());
		
//		Stream<String[]>을 IntStream으로 변환
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b) -> a+1);
		System.out.println(count);
		
		int sum = intStream2.reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		
		OptionalInt max = intStream3.reduce(Integer::max);
		OptionalInt min = intStream4.reduce(Integer::min);
		
		System.out.println(max.getAsInt());
		System.out.println(min.getAsInt());
		
		
	}
}
