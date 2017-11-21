package text;

public class MyThread extends Thread {
	char n;
	public MyThread (char newn) {
		this.n = newn;
	}
	public void run() {
		MyThread1 t1 = new MyThread1();
		for(int i = 0;i<10;i++) {			
			System.out.println(n);
			try {
				t1.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
