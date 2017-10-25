package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File {
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
		System.out.println("c的值有"+c+"个");
		System.out.println("j的值有"+j+"个");
		System.out.println("i的值有"+i+"个");
		f.close();
	}
}
