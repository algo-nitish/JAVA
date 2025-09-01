 package src.LinkedList;

public class implementLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class SLL {
        Node tail;
        Node head;
        int size;

        void insertTail(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void insertHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " "); // Corrected to access data
                temp = temp.next;
            }
            System.out.println();
        }

        int getSize() {
            return size; // Corrected to return size
        }


        void insert(int idx , int val){
            if(idx ==0){ insertHead(val); return;}
            if(idx == size) { insertTail(val); return;}
            if(idx > size) {System.out.println("Index out of bound"); return;}

            Node temp = new Node(val); 
            Node x = head;
          for (int i = 0; i < idx - 1; i++){
                x = x.next;
            }
            temp.next = x.next;
            x.next = temp;
            size++;
        }
         int get(int idx) throws Error{
            if(idx == size-1) return tail.data;
            if(idx >=size || idx<0){
                System.out.println("invalid index !!");
               throw new Error("Invalid Index !!")
            }
            Node temp = head;
            for(int i =1; i<=idx ; i++){
                temp = temp.next;
            }return temp.data;
         }
    }

    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertTail(10);
        list.insertTail(20);
        list.insertTail(30);
        list.display(); // 10 20 30
        list.insertHead(50);
        list.display(); // 50 10 20 30
        System.out.println("Size: " + list.getSize()); // 5

        list.insert(3,99 );
        list.display();
    }
}