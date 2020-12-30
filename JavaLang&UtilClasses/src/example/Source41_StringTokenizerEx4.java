package example;

import java.util.StringTokenizer;

public class Source41_StringTokenizerEx4 {
	
	static final String HANGUL_NUM = "영일이삼사오육칠팔구";
	static final String HANGUL_NUM_DIGITS = "십백천만억조";
	static final long[] UNIT = {10, 100, 1000, 10000, (long)1e8, (long)1e12};
	
	public static void main(String[] args) {
		String input = "삼십만삼천백십오";	// 303115
		System.out.println(input);
		System.out.println("---------------");
		System.out.println(hangulToNum(input));
	}
	
	public static long hangulToNum(String input) {  // 한글을 숫자로 바꾸는 메서드
		long result = 0;
		
		//1. 한글 숫자를 토큰화 한다
		StringTokenizer st = new StringTokenizer(input, HANGUL_NUM_DIGITS, true);
		
		//2. 상수와 토큰을 비교하여 숫자로 만든다.
		result = makeNumber(st);
		
		return result;
	}
	
	public static long makeNumber(StringTokenizer st){
		long result = 0;
		long tmpResult = 0;
		long num = 0;
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			int check = HANGUL_NUM.indexOf(token);
			
			if(check == -1) {
				if("만억조".indexOf(token) == -1) {
					tmpResult += (num != 0 ? num : 1) * UNIT[HANGUL_NUM_DIGITS.indexOf(token)];
				} else {
					tmpResult += num;
					result += (tmpResult != 0 ? tmpResult : 1) * UNIT[HANGUL_NUM_DIGITS.indexOf(token)];
					tmpResult = 0;
				}
				num = 0;
			}else {
				num = check;
			}
		}
		return result + tmpResult + num;
	}
	
}







