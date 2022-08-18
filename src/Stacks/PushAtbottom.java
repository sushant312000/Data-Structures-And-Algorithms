package Stacks;

import java.util.Stack;

public class PushAtbottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);

        System.out.print(s+" ");
        Stack<Integer> s2 = new Stack<>();

        while(!s.isEmpty()){
            s2.push(s.pop());
        }

        System.out.print(s2 + " ");
        System.out.print(s + " ");

        s.push(4);
        while(!s2.isEmpty()){
            s.push(s2.pop());
        }
        System.out.println(s+ " ");
    }
}
