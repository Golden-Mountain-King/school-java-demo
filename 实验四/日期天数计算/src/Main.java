import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		CDate date=new CDate();
		Scanner sc=new Scanner(System.in);
		System.out.print("�������꣺\t");
		int y=sc.nextInt(); //������
		if(date.whatYear(y)) {
			System.out.print("������");
		}
		else {
			System.out.print("��ƽ��");
		}
		System.out.print("\n");
		
		System.out.print("�������£�\t");
		int m=sc.nextInt();//������
		System.out.println("����һ����:"+date.daysInMonth(m)+"��");
		System.out.print("������ţ�\t");
		int d=sc.nextInt();
		System.out.println(y+"��"+m+"��"+d+"����һ���е�"+date.howManyDays(d)+"��");
		sc.close();
	}

}
