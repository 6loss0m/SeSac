package ch16;
class A4{}
class B4 extends A4{}
class C4 extends B4{}
class D4 extends C4{}
class MyClass4 <T extends C4>{
	
}
public class Q4 {

	public static void main(String[] args) {
		//MyClass4<A4> mca = new MyClass4<A4>(); //( X )
		//MyClass4<B4> mcb = new MyClass4<B4>(); //( X )
		MyClass4<C4> mcc = new MyClass4<C4>(); //( O )
		MyClass4<D4> mcd = new MyClass4<D4>(); //( O )
	}
}
