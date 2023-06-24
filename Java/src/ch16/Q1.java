package ch16;
class MyGeneric <T>{
	T t;
	public T get() {
		return t;
	}public void set(T t) {
		this.t = t;
	}
}
class A{
	@Override
	public String toString() {
		return "Å¬·¡½º A °´Ã¼";
	}
}
class B{
	@Override
	public String toString() {
		return "Å¬·¡½º B °´Ã¼";
	}
}
public class Q1 {

	public static void main(String[] args) {
		A a_in = new A();
		B b_in = new B();
		
		MyGeneric<A> mg1 = new MyGeneric<A>();
		mg1.set(a_in);
		A a_out = mg1.get();
		System.out.println(a_out);
		
		MyGeneric<B> mg2 = new MyGeneric<B>();
		mg2.set(b_in);
		B b_out = mg2.get();
		System.out.println(b_out);

	}

}
