// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         int times = nums.length / 3;
//         List<Integer> ans = new ArrayList<>();
//         for (int i = 0; i <nums.length; i++) {
//             int count = 0;
//             for (int j = 0; j < nums.length; j++) {
//                 if (nums[i] == nums[j]) {
//                     count++;
//                 }
//             }
//             if (count > times && !ans.contains(nums[i])) {
//                 ans.add(nums[i]);
//             }
//         }
//         return ans;
//     }
// }THIS IS o(n^2) approach with o(n)space complexity

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = 0;
            if (map.containsKey(num)) {
                count = map.get(num);
            }
            //else condition
            map.put(num, count + 1);
        }

        List<Integer> ans = new ArrayList<>();
        for (int key : map.keySet()) {
            int count = map.get(key);
            if (count > nums.length / 3) {
                ans.add(key);
            }
        }
        return ans;
    }
}