package example;

import java.util.Arrays;

enum RockPaperScissors {가위, 바위, 보}

public class Source05_EnumEx1 {
	public static void main(String[] args) {
		RockPaperScissors rPS1 = RockPaperScissors.가위;
		RockPaperScissors rPS2 = RockPaperScissors.valueOf("바위");
		RockPaperScissors rPS3 = Enum.valueOf(RockPaperScissors.class, "가위");
		
		System.out.println(rPS2.name());
		System.out.println(RockPaperScissors.valueOf("보"));
		
		System.out.println("rPS1=" + rPS1);
		System.out.println("rPS2=" + rPS2);
		System.out.println("rPS3=" + rPS3);
		
		System.out.println("rPS1==rPS2 ? " + (rPS1==rPS2));
		System.out.println("rPS1==rPS3 ? " + (rPS1==rPS3));
		System.out.println("rPS1.equals(rPS3) ? " + rPS1.equals(rPS3));
		
		System.out.println("rPS1.compareTo(rPS3) ? " + (rPS1.compareTo(rPS3)));
		System.out.println("rPS1.compareTo(rPS2) ? " + (rPS1.compareTo(rPS2)));
		
		System.out.println(rPS1.ordinal());
		System.out.println(rPS2.ordinal());
		
		switch(rPS1) {
			case 가위: // RockPaperScissors.가위 라고 쓸 수 없다.
				System.out.println("가위를 내셨습니다."); break;
			case 바위:
				System.out.println("바위를 내셨습니다."); break;
			case 보:
				System.out.println("보를 내셨습니다."); break;
		}
		RockPaperScissors[] rPSArr = RockPaperScissors.values();
		
		System.out.println(Arrays.toString(rPSArr));
		
		for(RockPaperScissors rPS : rPSArr) {
			System.out.printf("%s=%d%n", rPS.name(), rPS.ordinal());
		}
	}
}
