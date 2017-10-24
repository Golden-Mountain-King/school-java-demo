
public class main {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		CCircle c = new CCircle();
		try{
			c.setRadius(120);
			System.out.printf("圆的面积为："+c.area());
		}
		catch(RadiusIsNegative e) {
			System.out.printf("输入大于100");
		}
		catch(RadiusTooLarge e) {
			System.out.printf("输入小于0");
		}
	
	}

}
