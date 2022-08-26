package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets {
    public static boolean check(Stack<Character> st, char closingCh){
        if (st.size()==0){
            return false;
        } else if (st.peek()!=closingCh) {
            return false;
        }else {
            st.pop();
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            } else if (ch == ')') {
                boolean val = check(st, ch);
                System.out.println(val);
                if (!val){
                    return;
                }
            } else if (ch == '}') {
                boolean val = check(st, ch);
                System.out.println(val);
                if (!val){
                    return;
                }
            } else if (ch == ']') {
                boolean val = check(st, ch);
                System.out.println(val);
                if (!val){
                    return;
                }
            }
        }
        System.out.println(st.size() == 0);
    }
}
