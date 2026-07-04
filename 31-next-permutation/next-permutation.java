class Solution {
    public void nextPermutation(int[] nums) {
        // Your code goes here
        int n = nums.length;
        int breakpoint =-1;

        //first find break point
        for(int i = n-1 ;i>0 ;i--){
            if(nums[i] > nums[i-1]){
                breakpoint = i-1;
                break;
            }
        }

        if(breakpoint != -1){ //agr breakpoint -1 nhi h toh swpkrege find krke

            //ab breakpoint se just next greater element find krege 
            for(int i =n-1 ; i > breakpoint ;i--){

                 if(nums[i] > nums[breakpoint]){
                    int temp = nums[breakpoint];
                    nums[breakpoint] =nums [i];
                    nums[i] = temp;
                    break;
                }
            }
        }
            
        //ab remaining j bache swap krne k baad unko reverse kr dege
        reverse(nums, breakpoint+1, nums.length-1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}