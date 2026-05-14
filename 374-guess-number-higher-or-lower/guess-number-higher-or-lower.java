// The guess API is already defined for you.
// int guess(int num);

public class Solution extends GuessGame {

    public int guessNumber(int n) {

        int left = 1;
        int right = n;

        // Binary Search
        while (left < right) {

            // Find middle number
            int mid = left + (right - left) / 2;

            // guess(mid) returns:
            // -1 -> mid is bigger than target
            //  1 -> mid is smaller than target
            //  0 -> mid is correct

            if (guess(mid) <= 0) {
                // Target is at mid or before mid
                right = mid;
            } else {
                // Target is after mid
                left = mid + 1;
            }
        }

        // left will be the correct number
        return left;
    }
}