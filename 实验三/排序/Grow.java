/**
*冒泡排序的实现
*/

public class Grow{
    public static void main(String[] args){

    }
}


//交换数组元素
public static void swap(int []arr,int a,int b){
    arr[a]=arr[a]+arr[b];
    arr[b]=arr[a]-arr[b];
    arr[a]=arr[a]-arr[b];
}

//选择排序
public static void selectSort(int[] arr){
    for(int i=0;i<arr.length-1;i++){
        int min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        if(min!=i){
            swap(arr,min,i);
        }
    }
}

//冒泡排序
public static void bubbleSort(int[] arr){
    for(int i=0;i<arr.length-1;i++){
        boolenanflag=true;//设定一个标记，若为true，则表示此次的循环没有交换，也就是待排序列已经优先，排序已经完成
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[i]>arr[j+1]){
                swap(arr,j,j+1);
                flag=false;
            }
        }
        if(flag){
            break;
        }
    }
}

//