package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Duplicate_Brackets {
    public static void main(String[] args) {
        boolean duplicate = false;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i)==')'){
                if (st.peek()=='('){
                    duplicate = true;
                    System.out.println("Duplicate");
                    break;
                }
                else {
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else {
                st.push(str.charAt(i));
            }
        }

        if (!duplicate){
            System.out.println("No Duplicate");
        }
    }
}
