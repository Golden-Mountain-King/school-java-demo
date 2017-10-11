import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		CDate date=new CDate();
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入年：\t");
		int y=sc.nextInt(); //输入年
		if(date.whatYear(y)) {
			System.out.print("是闰年");
		}
		else {
			System.out.print("是平年");
		}
		System.out.print("\n");
		
		System.out.print("请输入月：\t");
		int m=sc.nextInt();//输入月
		System.out.println("本月一共有:"+date.daysInMonth(m)+"天");
		System.out.print("请输入号：\t");
		int d=sc.nextInt();
		System.out.println(y+"年"+m+"月"+d+"号是一年中的"+date.howManyDays(d)+"天");
		sc.close();
	}

}
