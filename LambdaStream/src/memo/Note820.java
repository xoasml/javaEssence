package memo;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// 임의의 수
/*
 * IntStream    new Random().ints()
 * LongStream   new Random().longs()
 * DoubldStream new Random().doubles()
 */
public class Note820 {
	public static void main(String[] args) {
		// 리미트를 정해주지 않았다.
		IntStream    iSt = new Random().ints();
		LongStream   lSt = new Random().longs();
		DoubleStream dSt = new Random().doubles();
		
		iSt.limit(1).forEach(System.out::println);
		lSt.limit(2).forEach(System.out::print);
		System.out.println();
		dSt.limit(3).forEach(System.out::print);
		System.out.println();
		
		
		// 리밋트를 정해주었다.
		IntStream    iSt1 = new Random().ints(1);
		LongStream   lSt1 = new Random().longs(2);
		DoubleStream dSt1 = new Random().doubles(3);
		
		iSt1.forEach(System.out::println);
		System.out.println();
		lSt1.forEach(System.out::println);
		System.out.println();
		dSt1.forEach(System.out::println);
		
		IntStream iSt2 = new Random().ints(1,11);
		iSt2.limit(1).forEach(System.out::println);
		
		IntStream iSt3 = new Random().ints(5, 1, 11); // 5칸짜리 스트림 1에서부터 11까지의 난수
		iSt3.forEach(System.out::println);
	}
}
