package Arrays;

import java.util.Scanner;

public class pairWithGivenSum {
    public static boolean find(int[] arr, int n, int sum) {     //O(N)
        int i;
        for (i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                break;
            }
        }

        int l = (i + 1) % n;
        int r = i;

        while(l!=r){
            if (arr[l]+arr[r] == sum){
                return true;
            } else if (arr[l] + arr[r] > sum) {
                r = (n+r-1)%n;
            }
            else{
                l = (l+1)%n;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        boolean ans = find(arr, n, sum);
        System.out.println(ans);
    }
}
