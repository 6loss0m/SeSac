package ch15;
class MyThread7 extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("ù ��° ���");
			Thread.sleep(1000);
			System.out.println("�� ��° ���");
			Thread.sleep(1000);
			System.out.println("�� ��° ���");
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("������ ����");
		}
	}
}
public class Q7 {

	public static void main(String[] args) {
		MyThread7 mt = new MyThread7();
		mt.start();
		try {Thread.sleep(1500);}catch(InterruptedException e) {}
		mt.interrupt();

	}
	/*  ���� ���
	    ù ��° ���
	    �� ��° ���
	    ������ ����
	 */

}
