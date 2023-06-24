package ch15;

class MyData{
	int data;
	synchronized void modifyData() {
		data++;
	}
}
class MyThread5 extends Thread{
	MyData myData;
	public MyThread5(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		for(int i=0; i<10000; i++) {
			myData.modifyData();
		}
		System.out.println(myData.data);
	}
}
public class Q5 {

	public static void main(String[] args) {
		MyData md = new MyData();
		MyThread5 mt1 = new MyThread5(md);
		mt1.start();
		
		try {Thread.sleep(100);}catch (InterruptedException e) {}
		MyThread5 mt2 = new MyThread5(md);
		mt2.start();

	}
	/* 실행 결과
	 *  10000
	 *  20000
	 */ 

}
