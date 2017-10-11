package 接口;

public class Main {

	public static void main(String[] args) {
		CCuboid box=new CCuboid(3,4,5);
		System.out.print("长方体的x为"+box.getX());
		System.out.print(",长方体的y为"+box.getY());
		System.out.println(",长方体的z为"+box.getZ());
		System.out.print("长方体的表面积为"+box.surfaceArea());
		System.out.println(",长方体的体积为"+box.volume());
		box.getYsetLength(1, 2, 3);
		System.out.print("\n");
		System.out.print("长方体的x为"+box.getX());
		System.out.print(",长方体的y为"+box.getY());
		System.out.println(",长方体的z为"+box.getZ());
		System.out.print("长方体的表面积为"+box.surfaceArea());
		System.out.println(",长方体的体积为"+box.volume());
		
	}

}
