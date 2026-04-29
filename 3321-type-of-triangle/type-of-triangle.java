// class Solution {
//     public String triangleType(int[] nums) {
//         for (int i = 0 ;i < nums.length; i++){
//             if(nums[0]==nums[1] && nums[1]== nums[2] && nums[2]==nums[0]){
//                 return "equilateral";
//             }
//             if(nums[0]==nums[1] || nums[1]==nums[2] || nums[0]== nums[2]){
//                 return "isosceles";
//             }
//             if(nums[0] != nums[1] != nums[2]){
//                 return "scalene";
//             }
//         }
//     }
// }

class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0], b = nums[1], c = nums[2];
        if (a + b <= c || b + c <= a || a + c <= b) {
            return "none"; // invalid triangle
        }
        if (a == b && b == c) {
            return "equilateral";
        }
        if (a == b || b == c || a == c) {
            return "isosceles";
        }
        return "scalene";
    }
}