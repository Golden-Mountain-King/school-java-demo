package �ӿ�;

public class Main {

	public static void main(String[] args) {
		CCuboid box=new CCuboid(3,4,5);
		System.out.print("�������xΪ"+box.getX());
		System.out.print(",�������yΪ"+box.getY());
		System.out.println(",�������zΪ"+box.getZ());
		System.out.print("������ı����Ϊ"+box.surfaceArea());
		System.out.println(",����������Ϊ"+box.volume());
		box.getYsetLength(1, 2, 3);
		System.out.print("\n");
		System.out.print("�������xΪ"+box.getX());
		System.out.print(",�������yΪ"+box.getY());
		System.out.println(",�������zΪ"+box.getZ());
		System.out.print("������ı����Ϊ"+box.surfaceArea());
		System.out.println(",����������Ϊ"+box.volume());
		
	}

}
