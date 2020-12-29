package example;

import java.util.Calendar;

public class Source04_CalendarEx4 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2015, 7, 31);	//2015년 8월 31일
		
		System.out.println(toString(cal));
		
		cal.add(Calendar.DATE, 1);
		System.out.println("1일 후");
		System.out.println(toString(cal));
		
		cal.add(Calendar.MONTH, -6);
		System.out.println("6달 전");
		System.out.println(toString(cal));
		
		cal.roll(Calendar.DATE, 31);
		System.out.println("31일 후(roll)");
		System.out.println(toString(cal));
		
		cal.add(Calendar.DATE, 31);
		System.out.println("31일 후(add)");
		System.out.println(toString(cal));
		
	}
	
	public static String toString(Calendar cal) {
		return cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH)+1) + "월 " + cal.get(Calendar.DATE) + "일";
	}
}
