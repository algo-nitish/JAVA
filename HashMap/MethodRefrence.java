// import java.util.ArrayList;
//     import java.util.Collections;
//     import java.util.Comparator;
//     import java.util.List;
// public class MethodRefrence {
  

    
    
//     class Customer {
//         private int id;
//         private String name;
    
//         public Customer(int id, String name) {
//             this.id = id;
//             this.name = name;
//         }
    
//         public int getId() {
//             return id;
//         }
    
//         public String getName() {
//             return name;
//         }
    
//         @Override
//         public String toString() {
//             return "Customer{" +
//                     "id=" + id +
//                     ", name='" + name + '\'' +
//                     '}';
//         }
//     }
    
//     class CustomerNameComparator implements Comparator<Customer> {
// /*************  ✨ Windsurf Command ⭐  *************/
// /**
//  * Compares two Customer objects based on their names in lexicographical order.
//  *
//  * @param c1 the first Customer object to be compared
//  * @param c2 the second Customer object to be compared
//  * @return a negative integer, zero, or a positive integer as the first argument 
//  *         is less than, equal to, or greater than the second
//  */

// /*******  b3f8075c-451c-4f64-8eae-a3c715dce208  *******/
//         @Override
//         public int compare(Customer c1, Customer c2) {
//             return c1.getName().compareTo(c2.getName());
//         }
//     }
    
//     class CustomerIdComparator implements Comparator<Customer> {
//         @Override
//         public int compare(Customer c1, Customer c2) {
//             return Integer.compare(c1.getId(), c2.getId());
//         }
//     }
    

// }
// public class ComparatorExample {
//     public static void main(String[] args) {
//         List<Customer> customers = new ArrayList<>();
//         customers.add(new Customer(3, "Charlie"));
//         customers.add(new Customer(1, "Alice"));
//         customers.add(new Customer(2, "Bob"));

//         System.out.println("Unsorted Customers:");
//         for (Customer customer : customers) {
//             System.out.println(customer);
//         }

//         // Sort by name
//         Collections.sort(customers, new CustomerNameComparator());
//         System.out.println("\nSorted by Name:");
//         for (Customer customer : customers) {
//             System.out.println(customer);
//         }

//          //Sort by ID
//         Collections.sort(customers, new CustomerIdComparator());
//         System.out.println("\nSorted by ID:");
//         for (Customer customer : customers) {
//             System.out.println(customer);
//         }
//     }
// }

// //reverse number without loop
// int y = 123;
// int x = 123%10;
// int z = 123/10;
