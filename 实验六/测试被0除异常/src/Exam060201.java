
public class Exam060201 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double num=1.0;
		try {
			num=1/0;
		}
		catch(ArithmeticException e) {
			System.out.print("An arithmetic exception occurred!");
		}
	}

}
