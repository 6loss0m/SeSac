package ch15;

class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			System.out.println(i + "ÃÊ");
		}
	}
}
public class Q1 {

	public static void main(String[] args) {
		MyThread my = new MyThread();
		my.run();

	}

}
