package text;

public class Exam090201 {

	public static void main(String[] args) {
		Thread curr;
		int num = 7;
		curr = Thread.currentThread();
		curr.setPriority(num);
		System.out.println("当前线程："+curr);
		System.out.println("线程名："+curr.getName());
		System.out.println("优先级："+curr.getPriority());
		curr.setName("线程1"); 
		System.out.println("修改后的线程名："+curr.getName());
	}

}
