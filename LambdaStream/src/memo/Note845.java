package memo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Note845 {
	public static void main(String[] args) {
		Student[] stuArr = Student.getStuArr();
		
		List<String> name = Stream.of(stuArr).map(Student::getName).collect(Collectors.toList());
		System.out.println(name);
		ArrayList<String> name1 = Stream.of(stuArr).map(Student::getName).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(name1);
		
		Student[] stuArr1 = Stream.of(stuArr).toArray(Student[]::new);
	}
}
