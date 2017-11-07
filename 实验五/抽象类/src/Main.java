import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		CBoss boss=new CBoss("张","凯",18000.00);
		System.out.println("员工的姓是："+boss.getFirstName());
		System.out.println("员工的名是："+boss.getLastName());
		System.out.println("员工的周工资是："+boss.getWeeklySalary());
		System.out.println("员工的工资是："+boss.earnings());
	}
}
