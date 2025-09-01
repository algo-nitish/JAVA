package DivideAndConquer;
//by recursion
class Binarysearch {
    public int search(int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (nums[m] == target) {
            return m;
        }
        if (target < nums[m]) {
            return search(nums, target, s, m - 1);
        }
        return search(nums, target, m + 1, e);
    }

          public static void main(String[] args) {
        int arr[] = {-1, 0, 3, 5, 9, 12};
        
        int target = 9;
        Binarysearch solution = new Binarysearch();  // Create an object of Solution
        int result = solution.search(arr, target, 0, arr.length - 1);
        System.out.println("Target found at index: " + result);  // Print the result
    }
}
// class Solution {
    
//     public static void main(String[] args) {
//         int arr[] = {-1, 0, 3, 5, 9, 12};
        
//         int target = 9;
//         Solution solution = new Solution();  // Create an object of Solution
//         int result = solution.search(arr, target, 0, arr.length - 1);
//         System.out.println("Target found at index: " + result);  // Print the result
//     }
// }
