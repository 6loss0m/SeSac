package ch16;
class MyClass{
	public <T> T myMethod(T t) {
		return t;
	}
}
public class Q2 {
	//myMethod() �޼����� �Է¸Ű������� ����"����", 3, 5.8�� �Ѱ� ���� ������ �ϼ�
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		String out1 = mc.<String>myMethod("����");
		Integer out2 = mc.<Integer>myMethod(3);
		Double out3 = mc.<Double>myMethod(5.8d);
		
		System.out.println(out1);
		System.out.println(out2);
		System.out.println(out3);

	}

}
