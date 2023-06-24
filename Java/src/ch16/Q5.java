package ch16;

class A5{}
class B5 extends A5{}
class C5 extends B5{}

class MyGeneric5 <T>{
	T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}
class MyClass5{
	void method1(MyGeneric5<B5> a) {}
	void method2(MyGeneric5<?> a) {}
	void method3(MyGeneric5<? extends B5> a) {}
	void method4(MyGeneric5<? super B5> a) {}

}
public class Q5 {

	public static void main(String[] args) {
		MyClass5 mc = new MyClass5();
		 //mc.method1(new MyGeneric5<A5>()); //( X )
		 mc.method1(new MyGeneric5<B5>()); //( O )
		 //mc.method1(new MyGeneric5<C5>()); //( X )
		 
		 mc.method2(new MyGeneric5<A5>()); //( O )
		 mc.method2(new MyGeneric5<B5>()); //( O )
		 mc.method2(new MyGeneric5<C5>()); //( O )
		 
		 //mc.method3(new MyGeneric5<A5>()); //( X )
		 mc.method3(new MyGeneric5<B5>()); //( O )
		 mc.method3(new MyGeneric5<C5>()); //( O )
		 
		 mc.method4(new MyGeneric5<A5>()); //( O )
		 mc.method4(new MyGeneric5<B5>()); //( O )
		// mc.method4(new MyGeneric5<C5>()); //( X )
	}

}
