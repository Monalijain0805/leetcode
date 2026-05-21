class Solution {
    public int reverse(int x) {

        int num = x;
        long rev = 0; // long to avoid overflow

        // run until number becomes 0
        while (num != 0) {

            int digit = num % 10; // get last digit

            rev = (rev * 10) + digit; // build reversed number

            // check overflow
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }

            num = num / 10; // remove last digit
        }

        return (int) rev; // convert long to int
    }
}