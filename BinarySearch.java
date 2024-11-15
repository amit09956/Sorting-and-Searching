package sort;

import java.util.Scanner;

public class BinarySearch{
    public static int binarSearch(int arr[],int search){
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==search){
                return mid;
            }
            if(arr[mid]>search){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        return -1;
       
    }
    public static void main(String[] args){
        int arr[]={1,3,4,5,6,7,8,9};

        Scanner sc=new Scanner(System.in);
        int search=sc.nextInt();
        System.out.println("Element is present at postion:"+binarSearch(arr, search));

    }
    
}
