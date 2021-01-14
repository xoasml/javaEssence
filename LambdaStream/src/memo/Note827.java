package memo;

import java.io.File;
import java.util.Map;
import java.util.stream.Stream;

public class Note827 {
	public static void main(String[] args) {
		Stream<File> fileStream = Stream.of(new File("Ex1.java"), new File("Ex1"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1.txt"));
		
		fileStream.map(File::getName).filter(s -> s.indexOf('.') != -1)
									 .map(String::toUpperCase)
									 .distinct().forEach(System.out::println);
		
		System.out.println("================================================");
		
		Stream<File> fileStream2 = Stream.of(new File("Ex1.java"), new File("Ex1"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1.txt"));
		fileStream2.map(File::getName)
			.filter(s -> s.indexOf('.') != -1)
			.peek(s->System.out.printf("filename = %s %n", s))
			.map(s -> s.substring(s.indexOf('.')+1))
			.peek(s->System.out.printf("extension = %s %n", s))
			.forEach(System.out::println);
	}
}
