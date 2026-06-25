

// //USING SORTING
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         Arrays.sort(nums);
//         return nums[nums.length - k];
//     }
// }




// //HEAP CONCEPT
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0;i < nums.length ;i++){      // for(int num : nums){  
            heap.add(nums[i]);                      //heap.add(num);
            if(heap.size() > k){
                heap.poll();   // remove smallest
            }
        }
        return heap.peek();
    }
}