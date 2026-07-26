// class Solution {
//     public int maximumProduct(int[] nums) {
//         int product =1;
//       for(int i =0;i<nums.length;i++){
//             product = product *nums[i];
//         }
//         return product;
//     }
// }
import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int a = nums[n-1] * nums[n-2] * nums[n-3]; // last 3 numbers
        int b = nums[0] * nums[1] * nums[n-1];     // first 2 + last 1

        if (a > b)
            return a;
        else
            return b;
    }
}