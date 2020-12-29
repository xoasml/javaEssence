package example;

import java.util.Calendar;

public class Source05_CalendarEx5 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(2015, 0, 31);	// 2015년 1월 31일
		System.out.println(toString(cal));
		cal.roll(Calendar.MONTH, 1);
		System.out.println(toString(cal));
	}
	
	public static String toString(Calendar cal) {
		return cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH)+1) + "월 " + cal.get(Calendar.DATE) + "일";
	}
}
