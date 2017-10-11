
public class China {
	float x=6.0f,y=10.0f;
	HuBei hubei;
	China(){
		hubei=new HuBei();
	}
	void fun() {
		System.out.println("这里是中国");
		hubei.showrate();
	}
	class HuBei extends CenterEast{
		float z;
		void showrate() {
			System.out.println("湖北是"+River+"占全国湖北比例="+z);
		}
		void countrate() {
			z=x/y;
			fun();
		}
	}
}
