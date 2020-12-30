package example;

public class Source01_ExceptionEx1 {
	public static void main(String[] args) {
		try {
			try {   } catch (Exception e) { }
		} catch (Exception e) {
//			try {   } catch (Exception e) { };	// 에러, e가 중복선언
		} // try-catch 끝
		
		try {
			
			
		}catch (Exception e) {
			
		} // try-catch 끝
	} // main메서드의 끝
}
