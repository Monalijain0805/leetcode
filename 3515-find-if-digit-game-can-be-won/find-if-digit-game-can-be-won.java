class Solution {
    public boolean canAliceWin(int[] nums) {

        int singlesum = 0;
        int doublesum = 0;
        int totalsum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0 && nums[i] < 10) {
                singlesum = singlesum + nums[i];
            }

            if (nums[i] > 9 && nums[i] < 100) {
                doublesum += nums[i];
            }

            totalsum += nums[i];
        }

        if (singlesum > totalsum / 2 || doublesum > totalsum / 2) {
            return true;
        } else {
            return false;
        }
    }
}