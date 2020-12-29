package example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice_DateParsing {
	public static void main(String[] args) throws ParseException {
		Date today = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String str = sdf1.format(today); // 2020-12-30
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd");
		Date parsDay = sdf2.parse(str);
		System.out.println(parsDay); // 결과 : Wed Dec 30 00:00:00 KST 2020
	}
}
