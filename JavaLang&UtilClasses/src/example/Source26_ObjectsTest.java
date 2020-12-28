package example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Source26_ObjectsTest {
	public static void main(String[] args) {
		String[][] str2D = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D_2 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		
		System.out.print("str2D   = {");
		for(String[] tmp : str2D) {
			System.out.print(Arrays.toString(tmp));
		}
		System.out.println("}");
		
		System.out.print("str2D_D = {");
		for(String[] tmp : str2D_2) {
			System.out.print(Arrays.toString(tmp));
		}
		System.out.println("}");
		
		System.out.println("Objects.equals(str2D, str2D_2) = " +Objects.equals(str2D, str2D_2));
		System.out.println("Objects.deepEquals(str2D, str2D_2) = " + Objects.deepEquals(str2D, str2D_2));
		System.out.println("Objects.isNull(null) = " + Objects.isNull(null));
		System.out.println("Objects.nonNull(null) = " + Objects.nonNull(null));
		System.out.println("Objects.hashCode(null) = " + Objects.hashCode(null));
		System.out.println("Objects.toString(null) = " + Objects.toString(null));
		System.out.println("Objects.toString(null, \"\")=" + Objects.toString(null,""));
		
		Comparator c = String.CASE_INSENSITIVE_ORDER; // 대소문자 구분 안하는 비교
		
		System.out.println("Object.compare(\"aa\", \"bb\", \"c\")" + Objects.compare("aa", "bb", c));
		System.out.println("Object.compare(\"bb\", \"aa\", \"c\")" + Objects.compare("bb", "aa", c));
		System.out.println("Object.compare(\"ab\", \"AB\", \"c\")" + Objects.compare("ab", "AB", c));
		String s1 = "안녕?";
		String s2 = null;
		System.out.println(Objects.toString(s2));		// null
		System.out.println(Objects.toString(s2,"객체가 null이면 이 문자열을 출력하세요."));	//
		System.out.println(Objects.toString(s1));		// null
		System.out.println(Objects.toString(s1,"객체가 null이면 이 문자열을 출력하세요."));	//
				
		Objects.requireNonNull(null, "null이면 익셉션 발생");
	}
}
