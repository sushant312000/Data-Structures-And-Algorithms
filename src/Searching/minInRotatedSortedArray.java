package Searching;

import java.util.Scanner;

public class minInRotatedSortedArray {
    public static int findMin(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while (left <= right){
            int mid = left + (right - left)/2;

            if(mid>=1 && arr[mid]>arr[mid-1]){
                return arr[mid];
            } else if (arr[mid] >= arr[0]) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }

        return arr[0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int res = findMin(arr);
        System.out.println(res);

    }
}
