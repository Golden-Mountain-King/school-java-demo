class A{
    //int x,y;
    //float z;
    double add(double f1,double f2){
        return f1+f2;
    }
    int add(int i1,int i2){
        return i1+i2;
    }
}

public class Exam030202{
    public static void main(String arg[]){
        A a=new A();
        System.out.println("浮点数相加="+a.add(1.1,2.2));
        System.out.println("整数相加="+a.add(1,2));
    }
}