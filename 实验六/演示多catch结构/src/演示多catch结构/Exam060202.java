package ��ʾ��catch�ṹ;

public class Exam060202 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
