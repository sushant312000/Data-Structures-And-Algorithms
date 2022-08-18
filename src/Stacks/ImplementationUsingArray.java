package Stacks;

import java.util.ArrayList;

public class ImplementationUsingArray {
    public static class Stack{
        ArrayList<Integer> al = new ArrayList<>();
        void push(int data){
            al.add(data);
        }

        boolean isEmpty(){
            return al.size() == 0;
        }
        int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = al.get(al.size()-1);
            al.remove(al.size()-1);
            return top;
        }

        int peek(){
            if (isEmpty()){
                return -1;
            }

            return al.get(al.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.isEmpty();
    }
}
