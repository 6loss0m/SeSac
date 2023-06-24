package ch15;

class MyData6{
	String name = "홍길동";
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

	/*  2개의 쓰레드가 공유 객체를 사용할 때 동시에 사용 가능한가?
	    Thread1			Thread2			동시사용
	    abc()			bcd()			 불가능
	    bcd()			cde()			 가 능
	    cde()			abc()			 가 능
	  
	  
	 */

}
