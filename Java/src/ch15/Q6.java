package ch15;

class MyData6{
	String name = "ȫ�浿";
	synchronized void abc() {
		
	}
	void bcd() {
		synchronized (this) {
		}
	}
	void cde() {
		synchronized (name) {
		}
	}
}

public class Q6 {

	/*  2���� �����尡 ���� ��ü�� ����� �� ���ÿ� ��� �����Ѱ�?
	    Thread1			Thread2			���û��
	    abc()			bcd()			 �Ұ���
	    bcd()			cde()			 �� ��
	    cde()			abc()			 �� ��
	  
	  
	 */

}
