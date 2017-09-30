class Textthree
{
	public static void main(String[] args){
        int i,j,temp;
        int a[][]={{5,6,2},{8,5,1},{4,9,3}};
        temp=a[0][0];
        for(i=0;i<3;i++)
            for(j=0;j<3;j++){
                if(a[i][j]<temp)
                temp=a[i][j];
            }
            System.out.println(temp);
        for(i=0;i<3;i++)
            for(j=0;j<3;j++){
                if(a[i][j]==temp)
                System.out.print(i+"\t"+j);
            }
                
                
            System.out.println("\n");
    }
    
}