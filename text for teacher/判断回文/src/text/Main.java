package text;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Symmetry s = new Symmetry();
		char[] c = {'a','b','a','#'};
		if(s.trueornot(c)) {
			System.out.println("�ǻ���");
		}
		else {
			System.out.println("���ǻ���");
		}
	}

}
