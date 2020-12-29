package example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Source12_DateFormatEx1 {
	public static void main(String[] args) throws ParseException {
		Date today = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today)); // 결과 : 2020-12-30
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("''yy년 MM월 dd일 E요일''");
		System.out.println(sdf2.format(today)); // 결과 : '20년 12월 30일 수요일'
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss.SSS");
		System.out.println(sdf3.format(today)); // 결과 : 2020년 12월 30일 수요일 03:28:23.359
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf4.format(today)); // 결과 : 2020-12-30 03:28:23 오전
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("올해 D번째 날입니다.");
		System.out.println(sdf5.format(today)); // 결과 : 올해 365번째 날입니다.
		
		SimpleDateFormat sdf6 = new SimpleDateFormat("이 달의 d번째 날입니다.");
		System.out.println(sdf6.format(today)); // 결과 : 이 달의 30번째 날입니다.
	}
}
