
public class main {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		CCircle c = new CCircle();
		try{
			c.setRadius(120);
			System.out.printf("Բ�����Ϊ��"+c.area());
		}
		catch(RadiusIsNegative e) {
			System.out.printf("�������100");
		}
		catch(RadiusTooLarge e) {
			System.out.printf("����С��0");
		}
	
	}

}
