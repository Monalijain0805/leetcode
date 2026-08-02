// Brute Force
// For every element in nums1:
// Find its position in nums2.
// Move towards the right.
// Return the first element greater than it.
// If none exists, return -1.
// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {

//         // Result array
//         int[] ans = new int[nums1.length];

//         // Traverse every element of nums1
//         for (int i = 0; i < nums1.length; i++) {

//             int j = 0;

//             // Step 1: Find nums1[i] inside nums2
//             while (nums2[j] != nums1[i]) {
//                 j++;
//             }

//             // Step 2: Search on the right side
//             int k = j + 1;

//             while (k < nums2.length && nums2[k] <= nums1[i]) {
//                 k++;
//             }

//             // Step 3: Store answer
//             if (k == nums2.length)
//                 ans[i] = -1;
//             else
//                 ans[i] = nums2[k];
//         }

//         return ans;
//     }
// }






import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> indexMap = new HashMap<>();

        // Store value -> index
        for (int i = 0; i < nums2.length; i++) {
            indexMap.put(nums2[i], i);
        }

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            int index = indexMap.get(nums1[i]);

            int nextGreater = -1;

            // Search on right side
            for (int j = index + 1; j < nums2.length; j++) {

                if (nums2[j] > nums1[i]) {
                    nextGreater = nums2[j];
                    break;
                }
            }

            ans[i] = nextGreater;
        }

        return ans;
    }
}