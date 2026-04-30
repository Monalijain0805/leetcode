// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int[] newarr = new int[nums.length];
//         for(int i =0 ;i< nums.length ; i++){
//             nums[i]= nums[i] * nums[i];
//             newarr[i] = nums[i];
//         }
//         Arrays.sort(newarr);
//         return newarr;
//     }
// }

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int left = 0, right = n - 1, index = n - 1;

        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                res[index] = nums[left] * nums[left];
                left++;
            } else {
                res[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }

        return res;
    }
}