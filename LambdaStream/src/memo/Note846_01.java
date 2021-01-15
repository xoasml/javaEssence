package memo;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Note846_01 {
	public static void main(String[] args) {
		Student[] stuArr = Student.getStuArr();
		
		Stream<Student> stuStream = Stream.of(stuArr);
		long count1 = stuStream.count();
		
		stuStream = Stream.of(stuArr);
		long count2 = stuStream.collect(Collectors.counting());
		
		System.out.println(count1 + " / " + count2);
		
		stuStream = Stream.of(stuArr);
		long totalScore1 = stuStream.mapToInt(Student::getTotalScore).sum();
		System.out.println(totalScore1);
		
		stuStream = Stream.of(stuArr);
		long totalScore2 = stuStream.collect(Collectors.summingInt(Student::getTotalScore));
		System.out.println(totalScore2);
		
		stuStream = Stream.of(stuArr);
		IntSummaryStatistics stat1 = stuStream.mapToInt(Student::getTotalScore).summaryStatistics();
		System.out.println(stat1);
		
		stuStream = Stream.of(stuArr);
		IntSummaryStatistics stat2 = stuStream.collect(Collectors.summarizingInt(Student::getTotalScore));
		System.out.println(stat2);
	}
}
