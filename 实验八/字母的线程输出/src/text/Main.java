package text;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t = new Thread();
		t.start();
		System.out.println("a,b交替输出");
		MyThread t0 = new MyThread('a');
		t0.start();
		MyThread t1 = new MyThread('b');
		t1.start();
		Thread.sleep(2000);
		
		System.out.println("先输出a，后输出b");
		MyThread t2 = new MyThread('a');
		t2.start();
		Thread.sleep(2000);
		MyThread t3 = new MyThread('b');
		t3.start();
	}
}
