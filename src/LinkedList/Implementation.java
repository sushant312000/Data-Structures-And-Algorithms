package LinkedList;

public class Implementation {
    public static class Node{                           //Creating a node
        int data;
        Node next;
    }
    public static class LinkedList{                     //Creating a Linked List
        Node head;
        Node tail;
        int size;

        void addLast(int val){                          //Adding value to the last of the list
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if(size==0){
                head = tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int size(){          //Get the size of the list
            return size;
        }               //Get size of the list

        public void display(){                          //Display the lsit
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void removeFirst(){                      //Remove First
            if(size==0){
                System.out.println("Empty");
            }
            else if (size==1) {
                head = tail = null;
                size=0;
            }
            else {
                head = head.next;
                size--;
            }
        }

        public int getFirst(){                          //Getting first element
            if(size==0){
                System.out.println("Empty");
                return -1;
            }
            else{
                return head.data;
            }
        }
        public int getLast(){                           //Getting last element
            if(size==0){
                System.out.println("Empty");
                return -1;
            }
            else{
                return tail.data;
            }
        }
        public int getAt(int idx){                      //Get element at specific index
            if(size==0){
                System.out.println("Empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
                return -1;
            } else{
                Node temp = head;
                for (int i=0; i<idx; i++){
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        public void addFirst(int val){                    //Add at first
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;
            if (size==0){
                tail = temp;
            }
            size++;
        }

        public void addAt(int idx, int val){                //Add at Specific Index
            if (idx < 0 || idx > size){
                System.out.println("Invalid Arguments");
            } else if (idx == 0) {
                addFirst(val);
            }else if (idx == size){
                addLast(val);
            }
            else{
                Node temp = head;
                Node node = new Node();
                node.data = val;
                for (int i=0; i<idx-1; i++){
                    temp = temp.next;
                }

                node.next = temp.next;
                temp.next = node;
                size++;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(5);
        l1.addLast(6);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.display();
        System.out.println(l1.size());
        l1.addFirst(9);
        l1.display();
        System.out.println(l1.getAt(4));
        System.out.println(l1.getLast());
        System.out.println(l1.getFirst());
        l1.removeFirst();
        l1.display();
        l1.addAt(2, 7);
        l1.display();
    }
}
