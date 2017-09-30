class Point{
	int x,y;
	Point(int a,int b){
		x=a;
		y=b;
	}
	Point(){
		x=-1;
		y=-1;
	}
}
public class Exam040107 {

	public static void main(String[] args) {
		Point p1=new Point();
		Point p2=new Point(10,10);
		System.out.println("p1µã=("+p1.x+","+p1.y+")");
		System.out.println("p2µã=("+p2.x+","+p2.y+")");

	}

}
