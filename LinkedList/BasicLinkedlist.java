// package LinkedList;

// public class BasicLinkedlist {

//     // Node class representing each element of the linked list
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     // Add element at the beginning of the list
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;

//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     // Add element at the end of the list
//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++;

//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;
//     }

//     // Add element at a specific index
//     public void addMed(int idx, int data) {
//         if (idx == 0) {
//             addFirst(data);
//             return;
//         }

//         Node newNode = new Node(data);
//         size++;
//         Node temp = head;
//         int i = 0;

//         while (i < idx - 1 && temp != null) {
//             temp = temp.next;
//             i++;
//         }

//         if (temp == null) {
//             System.out.println("Index out of bounds");
//             return;
//         }

//         newNode.next = temp.next;
//         temp.next = newNode;

//         // Update tail if new node is inserted at the end
//         if (newNode.next == null) {
//             tail = newNode;
//         }
//     }

    // // Print all elements in the list
    // public void print() {
    //     if (head == null) {
    //         System.out.println("LL is Empty");
    //         return;
    //     }

//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " --> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     // Remove the first element of the list
//     public int removefirst() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return -1;
//         }

//         int var = head.data;
//         head = head.next;
//         size--;

//         if (head == null) {
//             tail = null;
//         }

//         return var;
//     }

//     // Remove the last element of the list
//     public int removeLast() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return -1;
//         }

//         if (head.next == null) {
//             int val = head.data;
//             head = tail = null;
//             size--;
//             return val;
//         }

//         Node prev = head;
//         while (prev.next != tail) {
//             prev = prev.next;
//         }

//         int val = tail.data;
//         prev.next = null;
//         tail = prev;
//         size--;
//         return val;
//     }

//     // Main method for testing
//     public static void main(String[] args) {
//         BasicLinkedlist ll = new BasicLinkedlist();

//         ll.addFirst(2);         // 2
//         ll.addFirst(1);         // 1 -> 2

//         ll.addLast(4);          // 1 -> 2 -> 4
//         ll.addLast(5);          // 1 -> 2 -> 4 -> 5

//         ll.addMed(2, 3);        // 1 -> 2 -> 3 -> 4 -> 5

//         ll.print();
//         System.out.println("Size: " + ll.size);

//         ll.removefirst();       // Remove 1
//         ll.print();
//         System.out.println("Size after removeFirst: " + ll.size);

//         ll.removeLast();        // Remove 5
//         ll.print();
//         System.out.println("Size after removeLast: " + ll.size);
//     }
// }
