package ch16;
class A6 <K>{
	K k;
	public void setK(K k) {
		this.k = k;
	}
}
class B6<V, T> extends A6<T>{
	V v;
	public void setV(V v) {
		this.v = v;
	}
	public void print() {
		System.out.println(k + " : "+v);
	}
}
public class Q6 {

	public static void main(String[] args) {
		B6<String, Integer> b = new B6<>();
		b.setK(1);
		b.setV("감사");
		b.print();
		// 출력결과 : 1 : 감사
	}

}
