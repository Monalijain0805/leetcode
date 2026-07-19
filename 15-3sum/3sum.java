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


// 1. Sort the array.
// 2. Fix one element (i).
// 3. Put two pointers:
//       left = i + 1
//       right = last index
// 4. Find sum:
//       sum == 0 → Store answer, move both pointers.
//       sum < 0  → left++
//       sum > 0  → right--
// 5. Skip duplicates to avoid repeated triplets.


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0;i<n-2;i++){

             // Skip duplicate fixed elements
            if (i > 0 && nums[i] == nums[i - 1])//agr dono same value h tohh same ans aaega isliye ignore
                continue;
            int left=i+1;
            int right= n-1;
            while(left <right){
                int sum= nums[i]+nums[left]+nums[right];
                if(sum ==0){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                
                 // Skip duplicate left values
                    while (left < right && nums[left] == nums[left - 1])
                        left++;

                // Skip duplicate right values
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                }

                else if(sum > 0){
                    right--;
                }
                else{
                    left++;
                } 
            }
        }
        return ans;
    }
}
//Pehle array sort karte hain. Phir har element ko ek baar fix karte hain. Baaki do numbers ko left aur right pointers se dhoondhte hain. Agar sum 0 ho to triplet store karte hain aur dono pointers move karke duplicates skip karte hain. Agar sum chhota ho to left++ karte hain kyunki sorted array me sum badhega. Agar sum bada ho to right-- karte hain kyunki sum kam hoga. Is tarah har triplet sirf ek baar milta hai aur overall time complexity O(n²) hoti hai