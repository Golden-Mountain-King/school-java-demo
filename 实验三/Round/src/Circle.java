import java.lang.Math;

class CPoint{
	public int x;
	public int y;
	CPoint(){}
	CPoint(int a,int b){
		x=a;
		y=b;
	}
	void setPoint(int a,int b) {
		x=a;
		y=b;
	}
	int getx() {
		return x;
	}
	int gety() {
		return y;
	}
	public String toString() {
		return "父方法";
	}
	
}

class CCircle extends CPoint {
	CCircle(){}
	public double r;
	void setRasius(double r) {
		this.r=r;
	}
	double getRadius() {
		return r;
	}
	double area() {
		return r*r*Math.PI;
	}
	public String toString() {
		return"主方法";
	}
}


public class Circle {

	public static void main(String[] args) {
		CPoint point1=new CPoint();
		System.out.println("第一种构造方法,输出x的值为"+point1.getx()+"输出y的值为"+point1.gety());
		CPoint point2=new CPoint(1,2);
		System.out.println("第二种构造方法,输出x的值为"+point2.getx()+"输出y的值为"+point2.gety());
		CCircle circle=new CCircle();
		circle.setRasius(3.0);
		System.out.println("传入圆的值为3.0,传出圆的半径为"+circle.getRadius());
		System.out.println("传出圆的面积为"+circle.area());
	}

}
