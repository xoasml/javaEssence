package javaEssence;

public class Source16_InstanceofTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("이거 소방차 인스턴스임");
		}
		
		if(fe instanceof Car) {
			System.out.println("이거 자동차 인스턴스임");
		}
		
		if(fe instanceof Object) {
			System.out.println("이거 오브젝트 인스턴스임");
		}
		
		System.out.println(fe.getClass().getName());// 클래스의 이름을 출력
	}
}
