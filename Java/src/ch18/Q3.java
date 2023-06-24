package ch18;

interface A3{
	double abc(int k);
}
class B{
	double bcd(int k) {
		return k*0.1;
	}
}

public class Q3 {

	public static void main(String[] args) {
		A3 a = new A3() {
			@Override
			public double abc(int k) {
				B b = new B();
				return b.bcd(k);
			};
		};
		System.out.println(a.abc(5));
		
		A3 a1 = (k) -> {
			B b = new B();
			return b.bcd(k);
		};
		System.out.println(a1.abc(5));
	}

}
