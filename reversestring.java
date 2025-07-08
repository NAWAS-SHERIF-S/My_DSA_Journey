class Solution {
    public void reverseString(char[] s) {
        // Initialize two pointers: one at the start and one at the end
        int i = 0, j = s.length - 1;

        // Swap characters until the two pointers meet in the middle
        while (i < j) {
            swap(s, i++, j--); // Swap and move the pointers inward
        }
    }

    // Helper method to swap two characters in the array
    public void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
