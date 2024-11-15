package sort;


public class SelectionSort {
    public static int[] Selectionsort(int arr[]) {
      for (int i = 0; i < arr.length - 1; i++) {
        int temp = i;
        for (int j = i + 1; j < arr.length; j++) {
          if (arr[i] > arr[j]) {
            temp = j;
          }
        }
        int first = arr[temp];
        arr[temp] = arr[i];
        arr[i] = first;
      }
  
      return arr;
  
    }
  
    public static void main(String[] args) {
      int arr[] = { 5, 3, 2, 1, 7, 8, 6, 5, 6, 7 };
      Selectionsort(arr);
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  
  }
  