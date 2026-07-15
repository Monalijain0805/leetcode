// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         int n = nums.length;

//          // Create list to store all unique triplets
//         List<List<Integer>> list = new ArrayList<>();
        
//         for(int i =0;i<n-2;i++){
//             for(int j =i+1 ;j<n-1;j++){
//                 for(int k =j+1; k<n;k++){
//                     if(nums[i] + nums[j] + nums[k]==0){
//                         List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
//                         Collections.sort(temp);

//                         //agr list m temp store nhi h mtlb vo i j k toh store kr dege i mean add kr dege
//                         if (!list.contains(temp)) {
//                             list.add(temp);
//                         }
//                     }
//                 }
//             }
//         }
//         return list;
//     }
// }



import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Fix one element at a time
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Two pointers
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // Triplet found
                if (sum == 0) {

                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate left values
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers
                    left++;
                    right--;
                }

                // Sum is too small, increase it
                else if (sum < 0) {
                    left++;
                }

                // Sum is too large, decrease it
                else {
                    right--;
                }
            }
        }

        return ans;
    }
}