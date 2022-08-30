package Searching;

import java.util.Scanner;

public class Binary_search {
    public static int search(int[] arr, int n, int tar){
        int i=0;
        int j=n-1;
        int ans = -1;
        while (i<=j){
            int m = i + (j-i)/2;
            if(arr[m] == tar){
                ans = m;
            } else if (arr[m]<tar) {
                i = m+1;
            }else {
                j = m-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int res = search(arr, n ,target);
        System.out.println(res);
    }
}
