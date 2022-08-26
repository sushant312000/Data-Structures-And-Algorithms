package Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Sort_K_Sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int  k = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i<k; i++){
            pq.add(arr[i]);
        }

        for (int i=k+1; k<n; k++){
            pq.remove();
            pq.add(arr[i]);
        }

        while(pq.size()>0){
            System.out.println(pq.remove());
        }
    }
}
