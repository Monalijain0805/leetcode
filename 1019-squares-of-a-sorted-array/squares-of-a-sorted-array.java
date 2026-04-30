class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] newarr = new int[nums.length];
        Arrays.sort(nums);
        for(int i =0 ;i< nums.length ; i++){
            nums[i]= nums[i] * nums[i];
            newarr[i] = nums[i];
        }
        Arrays.sort(newarr);
        return newarr;
    }
}