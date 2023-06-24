package ch15;
class MyData8{
	boolean flag = false;
	synchronized void printA() {
		
		System.out.println("A");
	}
	synchronized void printB() {
		try {Thread.sleep(100);} catch (InterruptedException e) {}
		System.out.println("B");
	}
}
class ThreadA extends Thread{
	MyData8 myData;
	public ThreadA(MyData8 myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			myData.printA();
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}
class ThreadB extends Thread{
	MyData8 myData;
	public ThreadB(MyData8 myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			myData.printB();
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}
public class Q8 {

	public static void main(String[] args) {
		MyData8 myData = new MyData8();
		Thread t1 = new ThreadA(myData);
		Thread t2 = new ThreadB(myData);
			
		t1.start();
		t2.start();
	}
	/*  실행 결과
	 	A
	 	B
	 	A
	 	B
	 	A
	 	B
	 	A
	 	B
	 	A
	 	B
	 	
	 */
}
