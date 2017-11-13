package text;

public class myThread extends Thread{
	int sleeptime;
	public myThread(String id) {
		super(id);
		sleeptime = (int)(Math.random()*100);
		System.out.println("The Thread Name="+getName()+",Sleeping: "+sleeptime);
	}
	public void run() {
		try {
			Thread.sleep(sleeptime);
		} catch (InterruptedException e) {
			System.out.println("Exception: "+e.toString());
		}
		System.out.println("The running Thread="+getName());
	}
}
