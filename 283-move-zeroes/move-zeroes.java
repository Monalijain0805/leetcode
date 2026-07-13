// class Solution {
//     public void moveZeroes(int[] nums) {
//         int NoOfZeroes=0;
//         for(int ele:nums){
//             if(ele==0)NoOfZeroes++;
//         }
//         int n=nums.length;
//         for(int i=0;i<NoOfZeroes;i++){
//             for(int j=0;j<n-1-i;j++){
//                if(nums[j]==0){
//                   int temp=nums[j];
//                   nums[j]=nums[j+1];
//                   nums[j+1]=temp;
//                 }
//             }
//         }
//     }

class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; // position for non-zero elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}

