package example;

public class Practice03_InternTest {
	public static void main(String[] args) {
		String s = new String("abc");
		String s2 = new String("abc");
		String s3 = new String("abcd");
		boolean b = (s==s2);
		boolean b2 = s.equals(s2);
		boolean b3 = (s.intern() == s2.intern());
		"123".intern();
		System.out.println(s.intern());
		System.out.println(s2.intern());
		System.out.println(s3.intern());
	}
}
