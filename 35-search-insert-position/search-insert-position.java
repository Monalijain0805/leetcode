class Solution {
    public int searchInsert(int[] nums, int target) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // If target is found
            if (nums[i] == target) {
                return i;
            }

            // If current element is greater,
            // target should be inserted here
            else if (nums[i] > target) {
                return i;
            }
        }

        // If target is greater than all elements
        return n;
    }
}