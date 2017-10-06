
public class CCircle {
	NewCCircle newcir;
	private static double pi=3.14;
	private double radius;
	public CCircle(double r) {
		newcir=new NewCCircle();
		radius=r;
	}
	class NewCCircle{
		public void show() {
			System.out.println("area="+pi*radius*radius);
		}
	}
}

