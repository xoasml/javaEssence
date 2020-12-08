package example;

public class Source12_ArrayEx12 {
	public static void main(String[] args) {
		char[] cArr = {'안','녕','?'};
		String hi = new String(cArr);
		System.out.println(hi);
		
		String name[] = {"Kim", "Tae", "Hoon"};
		
		for(int i =0 ; i<name.length ; i++) {
			System.out.println(String.format("name[%d] : %s", i, name[i]));
		}
		
		String tmp = name[2];
		System.out.println("tmp : " + tmp);
		name[0] ="Yu";
		
		for(String str : name) {
			System.out.println(str);
		}
	}
}
