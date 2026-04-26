import java.util.*;
class Solution {
    static List<List<Integer>> arr;
    public void helper(int i, int[] nums, ArrayList<Integer> ans) {
        if (i == nums.length) {
            // make a copy of ans
            arr.add(new ArrayList<>(ans));
            return;
        }

        // not include nums[i]
        helper(i + 1, nums, ans);

        // include nums[i]
        ans.add(nums[i]);
        helper(i + 1, nums, ans);

        // backtrack
        ans.remove(ans.size() - 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0, nums, ans);
        return arr;
    }
}