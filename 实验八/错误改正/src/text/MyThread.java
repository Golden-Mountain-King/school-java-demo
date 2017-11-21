package text;
public class MyThread implements Runnable {
	String myString = "Yes";
	public void run() {
		this.myString = "No";
	}
}
