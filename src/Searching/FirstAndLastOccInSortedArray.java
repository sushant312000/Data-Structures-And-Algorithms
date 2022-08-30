package Searching;

import java.util.Scanner;

public class FirstAndLastOccInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left = 0;
        int right = n-1;
        int first = -1;
        int last = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = n-1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                last = mid;
                left = mid+1;
            } else if (arr[mid] < target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }

        System.out.println(first+" "+last);
    }
}
