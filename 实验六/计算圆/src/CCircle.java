import java.lang.Math;
public class CCircle {
	private double radius;
	public void setRadius(double r) throws RadiusTooLarge, RadiusIsNegative {
		if(r<=0) {
			//if(r<=0) {
				throw new RadiusTooLarge();
			}
		else if(r>100) {
				throw new RadiusIsNegative();
			//}
		}
		else {
			radius=r;	
		}
	}
	public double area() {
		return radius*radius*Math.PI;
	}
}
