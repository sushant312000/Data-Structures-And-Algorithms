package Arrays;

import java.util.Scanner;

public class arrayRotation {
    public static void rotationToRight(int[] arr, int r){       //O(N)
        int n = arr.length;
        r = r % n;
        int[] temp = new int[n];
        int m = 0;
        for (int i=n-r; i<n; i++){
            temp[m] = arr[i];
            m++;
        }

        for (int i=0; i<n-r; i++){
            temp[m] = arr[i];
            m++;
        }

        System.arraycopy(temp, 0, arr, 0, n);

        for (int j : arr) {
            System.out.print(j+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        rotationToRight(arr, k);
    }
}
