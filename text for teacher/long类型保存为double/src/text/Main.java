package text;

public class Main {
	public static void main(String [] args){
		double[][] d;
		String s ="1.1,2.5,3.12;4.56;5.13,6.0;7.6,8.8,99.2,10.11";
		//对s以分号为分隔符分离生成数组一维数组sFirst
		String sFirst[] = s.split(";");
		d = new double[sFirst.length][];
		for (int i=0;i<sFirst.length;i++){
			//System.out.println(sFirst[i]+" ");
			//对sFirst[i]以逗号为分隔符分离生成数组一维数组sSecond
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
