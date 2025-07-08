import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Create a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            
            // If the character is an opening bracket, push it to the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            // If the character is a closing bracket
            else {
                // If the stack is empty, there is no corresponding opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top element from the stack
                char open = stack.pop();

                // Check if the popped opening bracket matches the closing one
                if ((c == ')' && open != '(') ||
                    (c == '}' && open != '{') ||
                    (c == ']' && open != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets matched correctly
        return stack.isEmpty();
    }
}
