package file;

import java.io.FileInputStream;
import java.io.IOException;

public class File {
	@SuppressWarnings("resource")
	public static void main(String args[]) throws IOException {
		FileInputStream f;
		f=new FileInputStream("file.txt");
		int e;
		int c=0,j=0,i=0;
		do{
			e=f.read();
			switch(e) {
				case 99:c++;break;
				case 106:j++;break;
				case 105:i++;break;
				default:break;
			}	
		}while(e!=-1);
		System.out.println("c��ֵ��"+c+"��");
		System.out.println("j��ֵ��"+j+"��");
		System.out.println("i��ֵ��"+i+"��");
	}
}
