class A{
    public int a=4;
    private int b=5;
    protected int c=6;
    public int getb(){
        return b;
    }
}

class B extends A{
    public int d;
    public void testVisitControl(){
        System.out.println(a);
        //System.out.println(b);
        System.out.println(getb());
        System.out.println(c);
    }
}

public class Exam040103{
    public static void main(String arg[]){
        B obj=new B();
        obj.testVisitControl();
    }
}