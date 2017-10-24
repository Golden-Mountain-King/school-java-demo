package mypack2;
import mypack1.*;
/**
 * Exam030705
 */
public class Exam030705 {
    public static void main(String[] args) {
        Exam030703 e = new Exam030703();
        Exam030704 a = new Exam030704();
        a.setxy(10, 10);
        System.out.println("a.x="+a.getx());
        e.setx(2);
        System.out.println("e.x="+e.getx());
    }
    
}