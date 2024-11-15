package sort;



import java.util.Scanner;

public class LinearDearch {
    public static int linearSearch(int []arr,int searchElement){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]==searchElement){
                    return j+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={23,34,12,4,7,9,20,45,24,78,1};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the serached  element");
        int s=sc.nextInt();
        System.out.println(linearSearch(arr, s));
    }
    
}

