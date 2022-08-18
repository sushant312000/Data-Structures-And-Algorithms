package Sorting;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int i = low-1;
        int pivot = arr[high];
        for (int j=0; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int [] arr = {3,5,7,1,2,6,4};
        quickSort(arr, 0, arr.length-1);
    }
}
