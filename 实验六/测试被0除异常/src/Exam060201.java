
public class Exam060201 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double num=1.0;
		try {
			num=1/0;
		}
		catch(ArithmeticException e) {
			System.out.print("An arithmetic exception occurred!");
		}
	}

}
