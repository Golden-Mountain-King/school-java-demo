
public class Exam060301 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("Now ");
		try {
			System.out.print("is ");
			throw new NullPointerException();
		}
		catch (NullPointerException m) {
			System.out.print("the ");
		}
		System.out.print("time.\n");
	}

}
