package ch15;

public class Q3 {

	public static void main(String[] args) {
		Thread curThread = Thread.currentThread();
		System.out.println(curThread.getName());
		System.out.println(curThread.activeCount());
		
		Thread t1 = new Thread();
		System.out.println(t1.getName());
		
		Thread t2 = new Thread();
		t2.setName("�� ���� ������");
		System.out.println(t2.getName());
	}
	/* ���� ��� ���
	 *  main
	 *  1
	 *  Thread-0
	 *  �� ��° ������
	 */

}
