import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		CBoss boss=new CBoss("��","��",18000.00);
		System.out.println("Ա�������ǣ�"+boss.getFirstName());
		System.out.println("Ա�������ǣ�"+boss.getLastName());
		System.out.println("Ա�����ܹ����ǣ�"+boss.getWeeklySalary());
		System.out.println("Ա���Ĺ����ǣ�"+boss.earnings());
	}
}
