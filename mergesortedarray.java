import java.util.Arrays;

public class Solution {
  
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Copy nums2 elements into nums1 starting from index m
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        // Sort the merged array
        Arrays.sort(nums1);
    }
}

