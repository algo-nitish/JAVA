package helloDb;
public class array {
    
public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7};
int n
 = arr.length;
 int max = arr[0];
for(int i =0; i<n;i++){
      if(arr[i] < max){
          max = arr[i];
      } 
}
System.out.println(max); 

}



}


// package helloDb;

// public class array {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
//         int n = arr.length;
//         int max = 0;

//         for (int i = 0; i < n; i++) { // Corrected loop condition to include all elements
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println("Maximum value in the array: " + max);
//     }
// }
