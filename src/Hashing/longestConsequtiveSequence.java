package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class longestConsequtiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> s = new HashSet<>();
        for (int val : arr) {
            s.add(val);
        }

        int long_length = 0;
        for (int j : arr) {
            if (!s.contains(j - 1)) {
                int num = j;
                while (s.contains(num)) {
                    num++;
                }
                if (long_length < num - j) {
                    long_length = num - j;
                }
            }
        }

        System.out.println(long_length);
    }
}
