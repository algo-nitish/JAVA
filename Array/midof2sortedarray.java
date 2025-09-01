package Array;

import java.util.Arrays;

public class midof2sortedarray {
    
 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Arrays.sort(num1);
        // Arrays.sort(num2);

       int[] mergedArray = new int[nums1.length + nums2.length];

int index = 0;
for (int element : nums1) {
    mergedArray[index++] = element;
}

for (int element : nums2) {
    mergedArray[index++] = element;
}
Arrays.sort(mergedArray);
int len = mergedArray.length;
if (len % 2 == 0)
     return ( mergedArray[len / 2] +  mergedArray[len / 2 - 1]) / 2.0;

       
        else
            return  mergedArray[len / 2];
    }

}
