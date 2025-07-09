public class twosumII {
public class Solution {
 
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;                          // Initialize left pointer
        int right = numbers.length - 1;        // Initialize right pointer

        while (left < right) {
            int sum = numbers[left] + numbers[right]; // Calculate sum of values at pointers

            if (sum == target) {
                // Found the pair; return indices (+1 for 1-based indexing)
                return new int[] { left + 1, right + 1 };
            } else if (sum > target) {
                right--;  // Sum too large; move right pointer leftward
            } else {
                left++;   // Sum too small; move left pointer rightward
            }
        }
        // If no pair found (problem guarantees one solution, so this shouldn't happen)
        return new int[] {};
    }
}

}
