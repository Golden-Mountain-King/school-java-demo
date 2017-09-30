class A{
    int x;
    private int y;
    void set(int x,int y){
        this.x=x;
        this.y=y;
    }
    int getx(){
        return x;
    }
    int gety(){
        return y;
    }
    int add(){
        return(x+y);
    }
}

public class Exam030301{
    public static void main(String arg[]){
        A a1;
        a1=new A();
        a1.set(1,2);
        System.out.println(a1.x+"+"+a1.y+"="+a1.add());
        System.out.println(a1.getx()+"+"+a1.gety()+"="+a1.add());

        A a2=new A();
        a2.set(3,4);
        System.out.println(a2.x+"+"+a2.y+"="+a2.add());
        System.out.println(a2.getx()+"+"+a2.gety()+"="+a2.add());
        a1=null;
        a2=null;
    }
}