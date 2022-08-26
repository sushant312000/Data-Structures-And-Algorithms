package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class NGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        int[] newArr = new int[n];

        newArr[n-1] = -1;
        st.push(arr[n-1]);
        for (int i = n-2; i>=0; i--) {
            while (st.peek() < arr[i] && st.size() > 0) {
                st.pop();
            }

            if (st.size() > 0){
                newArr[i] = -1;
            }
            else {
                newArr[i] = st.peek();
            }
        }
        for (int j : newArr) {
            System.out.print(j + " ");
        }
    }
}
