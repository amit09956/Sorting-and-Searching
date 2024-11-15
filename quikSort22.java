package sort;


public class quikSort22 {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap the two number
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void quiksort(int arr[], int low, int high) {
        if (low < high) {
            int pindex = partition(arr, low, high);
            quiksort(arr, low, pindex - 1);
            quiksort(arr, pindex + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 7, 3, 0, 1 };
        int n = arr.length;
        quiksort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

