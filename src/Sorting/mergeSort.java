package Sorting;

import java.util.Scanner;

public class mergeSort {
    public static void conquer(int[] arr, int si, int mid, int ei){
        int[] merged = new int[ei - si +1];
        int i = si;
        int j = mid+1;
        int x = 0;
        while(i <= mid && j <= ei){
            if (arr[i] <= arr[j]){
                merged[x++] = arr[i++];
            }
            else{
                merged[x++] = arr[j++];
            }
        }

        while(i<=mid){
            merged[x++] = arr[i++];
        }

        while(j<=ei){
            merged[x++] = arr[j++];
        }

        for (int k=0, l=si; k<merged.length; k++, l++){
            arr[l] = merged[k];
        }
    }
    public static void divide(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        divide(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.print(i+" ");
        }

        System.out.println();
    }
}
