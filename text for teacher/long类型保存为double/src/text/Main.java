package text;

public class Main {
	public static void main(String [] args){
		double[][] d;
		String s ="1.1,2.5,3.12;4.56;5.13,6.0;7.6,8.8,99.2,10.11";
		//��s�Էֺ�Ϊ�ָ���������������һά����sFirst
		String sFirst[] = s.split(";");
		d = new double[sFirst.length][];
		for (int i=0;i<sFirst.length;i++){
			//System.out.println(sFirst[i]+" ");
			//��sFirst[i]�Զ���Ϊ�ָ���������������һά����sSecond
			String sSecond[] = sFirst[i].split(",");
			d[i] = new double[sSecond.length];
			for(int j=0;j<sSecond.length;j++){
				d[i][j] = Double.parseDouble(sSecond[j]);
			}
		}
		for(int i=0;i<d.length;i++){
			for(int j=0;j<d[i].length;j++){
				System.out.print(d[i][j]+" ");  
			}
			System.out.println();
		}
	}
}
