class Textone
{
	public static void main(String[] args) 
	{
		int i,a,b,c;
		for(i=100;i<1000;i++){
            a=i/100;
		    b=i/10%10;
		    c=i%10;
		    if(i==a*a*a+b*b*b+c*c*c) System.out.println(i);
        }
	}
}
