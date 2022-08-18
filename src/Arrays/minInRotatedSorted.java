package Arrays;

import java.util.Scanner;

public class minInRotatedSorted {
    public static int find(int[] arr, int n){       //O(logN)
        int low = 0;
        int high = n-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (arr[mid]==arr[high]) high--;
            else if (arr[mid]>arr[high]) {
                low = mid+1;
            }
            else high = mid;
        }

        return arr[high];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int ans = find(arr,n);

        System.out.println(ans);
    }
}
