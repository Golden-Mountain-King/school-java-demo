class Cbox{
    public int length;
    public int width;
    public int height;
    public int volune(){
        return(length*width*height);
    }
    public int surfaceArea(){
        return(2*((length*width)+(width*height)+(length*height)));
    }
    void setlwh(int l1,int w1,int h1){
        this.length=l1;
        this.width=w1;
        this.height=h1;
    }
}

public class Textfour{
    public static void main(String arg[]){
        Cbox box=new Cbox();
        box.setlwh(3,4,5);

        System.out.println("长方体的体积为："+box.volune());
        System.out.println("长方体的表面积为："+box.surfaceArea());
        //System.out.println(box.length);
    }
}