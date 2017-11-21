package text;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		System.out.println("ÂÒĞòÊä³ö£º");
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		Thread4 t4 = new Thread4();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		Thread.sleep(50);
		System.out.println("ÕıĞòÊä³ö£º");
		Thread1 t5 = new Thread1();
		Thread2 t6 = new Thread2();
		Thread3 t7 = new Thread3();
		Thread4 t8 = new Thread4();
		t5.start();Thread.sleep(50);
		t6.start();Thread.sleep(50);
		t7.start();Thread.sleep(50);
		t8.start();Thread.sleep(50);
	}

}
