package example;

import java.util.Random;

public class Source27_RandomEx1 {
	public static void main(String[] args) {

		Random rand1 = new Random(1);
		Random rand2 = new Random(1);

		for (int i = 0; i < 10; i++) {
//			System.out.println(Math.random() * 10);
			System.out.println(rand1.nextInt());
		}

		System.out.println();
		System.out.println();
		for (int i = 0; i < 10; i++) {
//			System.out.println(Math.random() * 10);
			System.out.println(rand2.nextInt());
		}
	}
}
