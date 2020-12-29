package example;

import java.util.Calendar;

public class Source02_CalendarEx2 {
	public static void main(String[] args) {
		//요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0은 비워두었다.
		final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		
		// month의 경우 0부터 시작하기 때문에 8월인 경우, 7로 지정해야한다.
		// date1.set(2015, Calender.AUGUST, 15);와 같이 할 수 있다.
		date1.set(1994, 5, 16); // 2020년 8월 15일로 날짜를 설정한다.
		System.out.println("date1은 " + toString(date1) + " " + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일 이고");
		
		System.out.println("오늘은 " + toString(date2) + " " + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일 입니다");
		
		long diffentTime = Math.abs(date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("그 날(date1)부터 지금(date2)까지 " + diffentTime + "초 지났습니다");
		
		long day = diffentTime / (24*60*60);
		System.out.println("일로 계산하면" + day + "입니다.");
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 " + (date.get(Calendar.MONTH)+1) + "월 " + date.get(Calendar.DAY_OF_MONTH) + "일";
	}
}
