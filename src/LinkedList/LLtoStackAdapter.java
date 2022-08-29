package LinkedList;

public class LLtoStackAdapter {
    public static class Node {                           //Creating a node
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    public void push(int data) {
        Node newNode = new Node(data);
        if (top != null) {
            newNode.next = top;
        }
        top = newNode;
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            top = top.next;
        }
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void peek() {
        System.out.println(top.data);
    }

    public static void main(String[] args) {
            LLtoStackAdapter s = new LLtoStackAdapter();
            s.push(4);
            s.push(3);
            s.push(8);
            s.push(9);
//            s.display();
            s.peek();
//            s.display();
    }
}
