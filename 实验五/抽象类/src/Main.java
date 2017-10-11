
public class Main {

	public static void main(String[] args) {
		CBoss boss=new CBoss("徐","薇",8000.00);
		System.out.println("员工的姓是："+boss.getFirstName());
		System.out.println("员工的名是："+boss.getLastName());
		System.out.println("员工的工资是："+boss.earnings());
	}
}
