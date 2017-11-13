package text;

public class Exam090202 {
	public static void main(String[] args) {
		myThread t1,t2,t3,t4;
		t1 = new myThread("Thread 1");
		t2 = new myThread("Thread 2");
		t3 = new myThread("Thread 3");
		t4 = new myThread("Thread 4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
