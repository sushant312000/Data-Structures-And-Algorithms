package Searching;

import java.util.Scanner;

public class transitionPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

//        int target = sc.nextInt();
        int ans = -1;

        int left = 0;
        int right = n-1;

        while (left <= right){
            int mid = left + (right - left)/2;

            if (arr[mid] == 0){
                left = mid+1;
            }
            else {
                ans = mid;
                right = mid-1;
            }
        }

        System.out.println(ans);
    }
}
