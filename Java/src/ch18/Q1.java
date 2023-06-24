package ch18;

interface A{
	void abc(double k);
}
public class Q1 {

	public static void main(String[] args) {
		
		A a = new A() {
			public void abc(double k) {
				System.out.println(k+0.5);
			};
		};
		a.abc(3.8);
		
		A a1 = (k) -> { System.out.println(k+0.5);};
		a1.abc(3.8);
	}

}
