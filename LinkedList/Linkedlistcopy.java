// package LinkedList;

public class Linkedlistcopy {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(11);
        Node c = new Node(12);
        Node d = new Node(13);
        Node e = new Node(14);

        // Linking the nodes (optional but useful in real cases)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Node temp1 = a;
        // System.out.println(temp1.data);

        // Example traversal
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("\n");
        // print(a);
        // recursiveprint(a);
        display(a);
    }

    public static void print(Node head){
        Node temp = head;
        while (temp != null) {   //print linklist
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        } 
    }
    public static void recursiveprint(Node head){
        if(head == null) return;
      System.out.println(head.data);
      recursiveprint(head.next);  //print recursive

    }

   public static void display(Node head){
        if(head == null) return;   //reverse print with recursion
        display(head.next);
        System.out.println(head.data + " ");
    }
}
