
public class movezeroes {

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int index = 0;  // Pointer to place the next non-zero element

        // Traverse and move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        // Fill the remaining positions with zeroes
        while (index < n) {
            nums[index++] = 0;
        }
    }
}
 