package ch15;

class MyRunnable implements Runnable{
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

public class Q2 {

	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();
		my.run();
	}

}
