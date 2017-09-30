class Cball{

    private double Pi=3.14;
    private double rasius;
    double getsurfaceArea(){
        return(4*Pi*rasius*rasius);
    }
    double getvolum(){
        return((3.0/4.0)*Pi*rasius*rasius*rasius);
    }
    void setRadius(double r){
        this.rasius=r;
    }
}

public class Textfive{
    public static void main(String args[]){
        Cball ball=new Cball();
        ball.setRadius(3.0);
        System.out.println("球体的表面积为："+ball.getsurfaceArea());
        System.out.println("球体的体积为："+ball.getvolum());
        
    }
}
