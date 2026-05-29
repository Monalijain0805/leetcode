class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit
        for (int i = n - 1; i >= 0; i--) {

            // If digit is less than 9, increase it and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0
            digits[i] = 0;
        }

        // If all digits were 9 (example: 999)
        int[] result = new int[n + 1];
        result[0] = 1; // Put 1 at first position

        return result;
    }
}