
public class Exam060301 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
