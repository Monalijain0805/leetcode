class Solution {
    public int[] rotate(int[] nums, int k) {
        int n = nums.length;

        // handle large k
        k = k % n;

        // Step 1: reverse last k elements
        reverse(nums, n - k, n - 1);

        // Step 2: reverse first n-k elements
        reverse(nums, 0, n - k - 1);

        // Step 3: reverse whole array
        reverse(nums, 0, n - 1);

        return nums;
    }

    // function to reverse part of array
    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];   // swap
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}