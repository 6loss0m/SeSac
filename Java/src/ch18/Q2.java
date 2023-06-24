package ch18;

interface A2{
	public int abc(String str);
}

public class Q2 {

	public static void main(String[] args) {
		A2 a = str -> str.length();
		System.out.println(a.abc("Hello"));
		
		A2 a1 = new A2() {
			public int abc(String str) {
				return str.length();
			};
		};
		System.out.println(a1.abc("Hello"));
	}

}
