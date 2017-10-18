package 演示多catch结构;

public class Exam060202 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[]= {0,0};
		int num=1,result=0;
		try {
			result=num/0;
			System.out.println(num/a[2]);
		}
		catch(ArithmeticException e) {
			System.out.println("Error=="+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error=="+e);
		}
		catch(Exception e) {
			System.out.println("Error=="+e);
		}
	}

}
