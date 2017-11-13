package text;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Symmetry s = new Symmetry();
		char[] c = {'a','b','a','#'};
		if(s.trueornot(c)) {
			System.out.println("是回文");
		}
		else {
			System.out.println("不是回文");
		}
	}

}
