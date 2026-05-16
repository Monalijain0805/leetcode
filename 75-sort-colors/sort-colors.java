// class Solution {
//     public void sortColors(int[] nums) {
//         int n=nums.length;
//         int noOfZeroes=0;
//         int noOfOnes=0;
//         int noOfTwoes=0;
//         for(int i=0;i<n;i++){
//            if(nums[i]==0)noOfZeroes++;
//            if(nums[i]==1)noOfOnes++;
//            if(nums[i]==2)noOfTwoes++;
//         }
//         for(int i=0;i<n;i++){
//             if(i<noOfZeroes) nums[i]=0;
//             else if(i<noOfZeroes+noOfOnes) nums[i]=1;
//             else nums[i]=2;
//         }
//     }
// }


//DUTCH FLAG ALGORITHM
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1)mid++;
            else{
            int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}