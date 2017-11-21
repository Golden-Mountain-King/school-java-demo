package text;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		Thread t0 = new Thread (t);
		t0.start(); 
		Thread t1 = new Thread();
		Thread.sleep(100);
		for(int i = 0;i < 10;i++) {
			System.out.println(t.myString);
		}
		
	}

}
