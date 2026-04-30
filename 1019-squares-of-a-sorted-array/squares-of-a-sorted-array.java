// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int[] newarr = new int[nums.length];
//         for(int i =0 ;i< nums.length ; i++){
//             nums[i]= nums[i] * nums[i];
//             newarr[i] = nums[i];
//         }
//         Arrays.sort(newarr);
//         return newarr;
//     }
// }

//USING TEO POINTERS- left ko aage se shruu kia right ko piche se shruru kia while loop lgake dekha agr left squares right squares se chota h toh resultant m nums of left into left  bhrdo or left ko plus plus krdo taaki aage wala check ho else right mtlb piche wale ka squares leke array m bhrdo or right-- krdo
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0, right = n - 1, index = n - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                res[index] = nums[left] * nums[left];
                left++;
            } else {
                res[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }

        return res;
    }
}