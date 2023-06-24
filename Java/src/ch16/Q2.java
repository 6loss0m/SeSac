package ch16;
class MyClass{
	public <T> T myMethod(T t) {
		return t;
	}
}
public class Q2 {
	//myMethod() 메서드의 입력매개변수로 각각"감사", 3, 5.8을 넘겨 다음 실행결과 완성
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		String out1 = mc.<String>myMethod("감사");
		Integer out2 = mc.<Integer>myMethod(3);
		Double out3 = mc.<Double>myMethod(5.8d);
		
		System.out.println(out1);
		System.out.println(out2);
		System.out.println(out3);

	}

}
