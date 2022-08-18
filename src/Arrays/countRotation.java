package Arrays;

import java.util.Scanner;

public class countRotation {
    public static int count(int[] arr, int n){      //O(logn)
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (high + low)/2;
            if(arr[mid]<=arr[mid-1] && arr[mid]<=arr[mid+1]){
                return mid;
            }
            else if(arr[mid] >= arr[low]){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = count(arr, n);
        System.out.println(ans);
    }
}
