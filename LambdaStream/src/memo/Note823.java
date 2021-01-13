package memo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Note823 {
	public static void main(String[] args) {
		/* 스트림 자르기 skip(), limit()
		 * skip(long n)은 매개변수 만큼 앞의 요소를 건너뛰고
		 * limit(long maxSize)은 매개변수만큼만 요소를 사용한다.
		 */
		Stream<Integer> stream = Stream.iterate(0, i-> i=i+1);
		stream.skip(3).limit(10).forEach(System.out::println);  // 3번 부터 10개 출력
		
		
		System.out.println("=========================");
		
		
		/* 스트림 요소 걸러내기 filter(), distinct()
		 * distinct()는 스트림에서 중복된 요소들을 제거한다.
		 * filter()는 주어진 조건(Predicate)에 맞지 않는 요소를 걸러낸다.
		 */
		Integer[] forList = {1,1,1,2,2,2,3,4,5,6,7};
		List<Integer> list = new ArrayList<>(Arrays.asList(forList));
		Stream<Integer> ls = list.stream();
		ls.distinct().forEach(System.out::println);
		
		System.out.println("=======================================");
		
		Stream<Integer> ls2 = list.stream();
		ls2.filter(i -> i%2==0).forEach(System.out::println);
		
		System.out.println("=======================================");
		
		Stream<Integer> ls3 = list.stream();
		ls3.filter(i->i%2==0).distinct().forEach(System.out::println);
		
	}
}
