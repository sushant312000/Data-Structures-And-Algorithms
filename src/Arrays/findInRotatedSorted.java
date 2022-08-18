package Arrays;

import java.util.Scanner;

public class findInRotatedSorted {
    public static int find(int[] arr, int k){       //O(logn)
        int start = 0;
        int last = arr.length-1;
        int ans = -1;
        while(start<=last){
            int mid = (start+last)/2;
            if(arr[mid]==arr[start]){
                ans = mid;
            }
            if(arr[mid]>=arr[start]){
                if(k>=arr[start] && k<=arr[mid]){
                    last =mid-1;
                }else start = mid+1;
            }
            else {
                if(k>=arr[mid] && k<=arr[last]){
                    start = mid+1;
                }else last = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int ans = find(arr, target);
        System.out.println(ans);
    }
}
