
public class China {
	float x=6.0f,y=10.0f;
	HuBei hubei;
	China(){
		hubei=new HuBei();
	}
	void fun() {
		System.out.println("�������й�");
		hubei.showrate();
	}
	class HuBei extends CenterEast{
		float z;
		void showrate() {
			System.out.println("������"+River+"ռȫ����������="+z);
		}
		void countrate() {
			z=x/y;
			fun();
		}
	}
}
