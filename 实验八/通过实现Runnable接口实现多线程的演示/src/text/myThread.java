package text;

public class myThread implements Runnable {
	int count = 1,number;
	public myThread(int num) {
		number = num;
		System.out.println("�����̣߳�"+number);
	}
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("�߳� "+number+": ���� "+count);
			if(++count==6)
				return;
		}
	}

}
