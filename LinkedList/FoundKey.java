// package LinkedList;

public class FoundKey {
    
 //search for a key in ll.return the position where it is found.if not found, return -1...

public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
     // Add element at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add element at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Add element at a specific index
    public void addMed(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
         // Update tail if new node is inserted at the end
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Print all elements in the list
    public void print() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int itrSearch(int key){
        Node temp  = head;
        int i =0;
        
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
     // Main method for testing
    public static void main(String[] args) {
        FoundKey ll = new FoundKey();

        ll.addFirst(2);         // 2
        ll.addFirst(1);         // 1 -> 2

        ll.addLast(4);          // 1 -> 2 -> 4
        ll.addLast(5);          // 1 -> 2 -> 4 -> 5

        ll.addMed(2, 3);        // 1 -> 2 -> 3 -> 4 -> 5

        ll.print();

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));
    }





}
