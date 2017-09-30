package mypack2;
import mypack1.*;
class BA extends Exam040104{
    public int e;
    public void test(){
        System.out.println("public int "+a);
        System.out.println("geta()="+geta());
        System.out.println("private int b="+b);
        System.out.println("getb()="+getb());
        System.out.println("protected int c="+c);
        System.out.println("getc()="+getc());
        System.out.println("int d="+d);
        System.out.println("getd()="+getd());
        System.out.println("getd1()"+getd1());
    }
}

public class Exam040105{
    public int e;
    public static void main(String arg[]){
        BA ba=new BA();
        ba.test();
    }
}