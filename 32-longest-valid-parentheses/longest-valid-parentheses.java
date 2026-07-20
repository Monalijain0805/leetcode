class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();

        // Push -1 as a base index
        // This helps calculate length when valid substring starts from index 0
        st.push(-1);
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                // Store its index in the stack
                st.push(i);
            } 
            else { // Current character is ')'
                // Remove one matching '(' index
                st.pop();

                // If stack becomes empty,
                // this ')' cannot be matched
                if (st.isEmpty()) {

                    // Store this ')' index as the new base
                    st.push(i);

                } 
                else {

                    // Current valid length
                    // = Current Index - Previous Unmatched Index
                    int length = i - st.peek();

                    // Update maximum length
                    maxLength = Math.max(maxLength, length);
                }
            }
        }

        // Return the longest valid parentheses length
        return maxLength;
    }
}