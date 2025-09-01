package NOTHING;

public class minimumOperation {
    
     public  static int minimumOperations(int[] nums) {
        int[] hashmap = new int[101];
        int lastIndex = 0;

        // Iterate backwards to find where duplicates start
        for (int i = nums.length - 1; i >= 0; i--) {
            if (hashmap[nums[i]] > 0) {
                lastIndex = i + 1;
                break;
            }
            hashmap[nums[i]]++;
        }

        // If no duplicates found, lastIndex stays 0 => all unique
        // We assume we want to perform operations in groups of 3
        if (lastIndex % 3 == 0) {
            return lastIndex / 3;
        } else {
            return ( lastIndex + 1 )/ 3 ;
        }
    }
    public static void main(String[] args) {
        // minimumOperation mo = new minimumOperation();
        int[ ] nums = {1,2,3,4,2,3,3,5,7};
        // int[] nums1 = {5,7,3,2,7,3};
        // int result = mo.minimumOperations(nums);
        // System.out.println("Minimum Operations :" + result);
        System.out.println(minimumOperations(nums));
    }
}
