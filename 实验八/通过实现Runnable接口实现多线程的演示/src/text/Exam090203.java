package text;

public class Exam090203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i <3;i++) {
			new Thread(new myThread(i+1)).start();
		}
	}
}
