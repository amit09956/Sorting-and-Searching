package sort;


public class mergeSort11 {
    public static void conquare(int arr[],int si,int mid,int ei){
       int merged[]=new int[ei-si+1];
       int index1=si;
       int index2=mid+1;
       int x=0;
       while(index1<=mid&&index2<=ei){//my name is shubham
        if(arr[index1]<=arr[index2]){
            merged[x++]=arr[index1++];
        }
        else{
            merged[x++]=arr[index2++];
        }
       } 
       while(index1<=mid){
        merged[x++]=arr[index1++];
       }      
       while(index2<=ei){
        merged[x++]=arr[index2++];
       }
       for(int i=0,j=si;i<merged.length;i++,j++){
        arr[j]=merged[i];
       }
    }
    public static void devide(int arr[],int si,int ei ){
        if(si>=ei){
            return;
        }

        int mid=(int)(si+ei)/2;
        devide(arr,si,mid);
        devide(arr,mid+1,ei);
        conquare(arr, si, mid, ei);
    }
    public static void main(String[] args){
       int arr[]={3,6,9,12,1,2,6,0};
       int n=arr.length;
       devide(arr,0,n-1);
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
}

