package text;

import java.io.*;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		Random r = new Random();
		int [] a = new int [100];
		int one,two,three,four,five;
		one=two=three=four=five=0;
		for(int i = 0;i<100;i++) {
			a[i] =r.nextInt(100); 
		}
		for(int i = 0;i<100;i++) {
			if(a[i]>=0&&a[i]<59) {
				one++;
			}
			if(a[i]>=60&&a[i]<69) {
				two++;
			}
			if(a[i]>=70&&a[i]<79) {
				three++;
			}
			if(a[i]>=80&&a[i]<89) {
				four++;
			}
			if(a[i]>=90&&a[i]<100) {
				five++;
			}
		}
		File f = new File("a.txt");
		FileOutputStream f0 = new FileOutputStream(f);
		System.out.println("λ������[0,59]����"+one+"����");
		System.out.println("λ������[60,69]����"+two+"����");
		System.out.println("λ������[70,79]����"+three+"����");
		System.out.println("λ������[80,89]����"+four+"����");
		System.out.println("λ������[90,99]����"+five+"����");
	}

}
