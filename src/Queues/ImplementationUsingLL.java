package Queues;

public class ImplementationUsingLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static class Queue {
        Node head = null;
        Node tail = null;

        public void add(int val) {
            Node newNode = new Node(val);
            if (tail == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;

            if (head == tail) {
                tail = null;
            }

            head = head.next;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(4);
        q.add(6);
        q.add(8);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}

