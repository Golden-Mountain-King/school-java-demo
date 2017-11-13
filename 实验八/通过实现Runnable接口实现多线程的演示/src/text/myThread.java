package text;

public class myThread implements Runnable {
	int count = 1,number;
	public myThread(int num) {
		number = num;
		System.out.println("创建线程："+number);
	}
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("线程 "+number+": 计数 "+count);
			if(++count==6)
				return;
		}
	}

}
