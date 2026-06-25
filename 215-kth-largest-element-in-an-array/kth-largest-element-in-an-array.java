// class Solution {
//     static int ans;
//     public void swap(int[]arr,int i,int j){
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
//     public int partition(int[]arr,int low,int high){
//         int pivot=arr[low];
//         int pivotindex=low;
//         int smallerCount = 0;
//         for (int i = low; i <= high; i++) {
//            if (arr[i] <= pivot) smallerCount++;
//         }
//         // subtract 1 to account for pivot itself
//         int correctindex = low + smallerCount - 1;

//         swap(arr,pivotindex,correctindex);
//         int i=low;
//         int j=high;
//         while(i < correctindex && j > correctindex){
//             if(arr[i]<pivot)i++;
//             else if(arr[j]>pivot)j--;
//             else if(arr[i]>pivot && arr[j]<=pivot){
//                 swap(arr,i,j);
//             }
//         }
//         return correctindex;
//     }
//     public void quickselect(int[]arr,int low,int high,int k){
//         if(low>high)return;
//         // if(low==high){
//         //     if(low==k-1)ans=arr[low];
//         //     return;
//         // }
//         int index=partition(arr,low,high);
//         if(index==k-1){
//             ans=arr[index];
//             return;
//         }
//         if(k-1 < index)quickselect(arr,low,index-1,k);
//         else quickselect(arr,index+1,high,k);
//     }
//     public int findKthLargest(int[] arr, int k) {
//     ans = -1;
//     int n = arr.length;
//     quickselect(arr, 0, n - 1, n - k + 1);
//     return ans;
//     }
// }







// class Solution {
//     static int ans;
//     public void swap(int[]arr,int i,int j){
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
//     public int partition(int[]arr,int low,int high){
//         int mid=(low+high)/2;
//         int pivot=arr[mid];
//         int pivotindex=mid;
//         int smallerCount = 0;
//         for (int i = low; i <= high; i++) {
//             if(i==mid)continue;
//            if (arr[i] <= pivot) smallerCount++;
//         }
//         int correctindex = low + smallerCount;

//         swap(arr,pivotindex,correctindex);
//         int i=low;
//         int j=high;
//         while(i < correctindex && j > correctindex){
//             if(arr[i]<=pivot)i++;//yha equal nhi lgaya to time exceed ho rhi
//             else if(arr[j]>pivot)j--;
//             else if(arr[i]>pivot && arr[j]<=pivot){
//                 swap(arr,i,j);
//             }
//         }
//         return correctindex;
//     }
//     public void quickselect(int[]arr,int low,int high,int k){
//         if(low>high)return;
//         // if(low==high){
//         //     if(low==k-1)ans=arr[low];
//         //     return;
//         // }
//         int index=partition(arr,low,high);
//         if(index==k-1){
//             ans=arr[index];
//             return;
//         }
//         if(k-1 < index)quickselect(arr,low,index-1,k);
//         else quickselect(arr,index+1,high,k);
//     }
//     public int findKthLargest(int[] arr, int k) {
//     ans = -1;
//     int n = arr.length;
//     quickselect(arr, 0, n - 1, n - k + 1);
//     return ans;
//     }
// }



// class Solution {
//     static int ans;

//     public void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public int partition(int[] arr, int low, int high) {
//         int pivot = arr[low];   // \U0001f511 pivot = first element
//         int pivotindex = low;

//         int greaterCount = 0;
//         for (int i = low + 1; i <= high; i++) {
//             if (arr[i] >= pivot) greaterCount++; // count bade elements
//         }

//         int correctindex = low + greaterCount;  // pivot ki sahi jagah (descending)
//         swap(arr, pivotindex, correctindex);

//         int i = low, j = high;
//         while (i < correctindex && j > correctindex) {
//             if (arr[i] >= pivot) i++;
//             else if (arr[j] < pivot) j--;
//             else {
//                 swap(arr, i, j);
//                 i++;
//                 j--;
//             }
//         }
//         return correctindex;
//     }

//     public void quickselect(int[] arr, int low, int high, int k) {
//         if (low > high) return;

//         int index = partition(arr, low, high);

//         if (index == k - 1) {  // \U0001f511 directly kth largest
//             ans = arr[index];
//             return;
//         }
//         if (k - 1 < index) quickselect(arr, low, index - 1, k);
//         else quickselect(arr, index + 1, high, k);
//     }

//     public int findKthLargest(int[] arr, int k) {
//         ans = -1;
//         quickselect(arr, 0, arr.length - 1, k);
//         return ans;
//     }
// }






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
        for(int num : nums){
            heap.add(num);
            if(heap.size() > k){
                heap.poll();   // remove smallest
            }
        }
        return heap.peek();
    }
}