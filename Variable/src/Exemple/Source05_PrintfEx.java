package Exemple;

import java.util.*;

public class Source05_PrintfEx {
	public static void main(String[] args) {
		String url = "www.codechobo.com";
		
		float f1 = .10f;	// 0.10, 1.0e-1
		float f2 = 1e1f;	// 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		//실수 표현 지시자는 %f %e %g가 있음
		//보통은 %f를 많이 사용
		//%e는 지수형태로 표현할때 사용
		//%g는 간략하게 표현할때 사용
		System.out.printf("1. f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("2. f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("3. f3=%f, %e, %g%n", f3, f3, f3);
		
		
		System.out.printf("4. d=%f%n", d);
		System.out.printf("5. d=%14.10f%n", d); // 14.10   : 전체 14자리 중 소수점 10자리
		System.out.printf("6. d=%014.10f%n", d); // 014.10 : 앞의 빈칸 0으로 채우고 전체 14자리중 소수점 10자리
		
		
		
		System.out.printf("7. [12345678901234567890]%n");
		System.out.printf("8. [%s]%n", url);
		System.out.printf("9. [%20s]%n", url);		//20칸사용
		System.out.printf("1. [%-20s]%n", url);		//왼쪽정렬
		System.out.printf("2. [%.8s]%n", url);		//왼쪽에서 8글자만 출력
		// 공백이 있을 경우 기본적으로 우측 끝에 문자열이 붙지만 %-20s 처럼 -를 붙이면 좌측 끝에 붙는다
	}
}
