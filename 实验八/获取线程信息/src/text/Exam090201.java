package text;

public class Exam090201 {

	public static void main(String[] args) {
		Thread curr;
		int num = 7;
		curr = Thread.currentThread();
		curr.setPriority(num);
		System.out.println("��ǰ�̣߳�"+curr);
		System.out.println("�߳�����"+curr.getName());
		System.out.println("���ȼ���"+curr.getPriority());
		curr.setName("�߳�1"); 
		System.out.println("�޸ĺ���߳�����"+curr.getName());
	}

}
