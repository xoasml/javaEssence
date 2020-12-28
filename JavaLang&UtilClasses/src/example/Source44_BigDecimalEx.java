package example;

import java.math.*;
import java.math.BigDecimal;


public class Source44_BigDecimalEx {
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal("3");
		BigDecimal bd2 = new BigDecimal("2");
		BigDecimal bd3;
		System.out.println(bd3 = bd1.divide(bd2));
		System.out.println(bd1.divide(bd2, RoundingMode.HALF_UP));
		System.out.println(bd3.setScale(0, RoundingMode.HALF_UP));
	}
}
