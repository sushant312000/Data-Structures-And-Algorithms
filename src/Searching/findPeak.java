package Searching;

import java.util.Scanner;

public class findPeak {
    public static int peak(int[] arr){
        int left = 1;
        int right = arr.length-2;

        while (left <= right){
            int mid = left+(right-left)/2;

            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return arr[mid];
            } else if (arr[mid] < arr[mid+1]) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }

        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int res = peak(arr);
        System.out.println(res);
    }
}
