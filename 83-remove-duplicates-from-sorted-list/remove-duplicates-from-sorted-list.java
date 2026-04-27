// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         if (head == null) return head;
//         ListNode a = head;  // acts like current pointer
//         ListNode b = head;  // not really needed, but kept for your style
//         while (a != null && a.next != null) {
//             if (a.val == a.next.val) {
//                 // skip duplicate node
//                 a.next = a.next.next;
//             } else {
//                 // move ahead
//                 a = a.next;
//             }
//         }
//         // b was same as head, so return it
//         return b;
//     }
// }

//RAGHAV PW WALLAHH
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         if (head == null) return head;
//         ListNode a = head;  
//         ListNode b = head; 
//         while (b != null) {
//             if (b.val == a.val)
//                 b = b.next;   // skip duplicate values
//             else {
//                 a.next = b;   // connect the last unique node to new unique node
//                 a = b;      //move a froward
//             }
//         }
//         a.next = null;  // cut off any remaining duplicates at the end
//         return head;
//     }
// }


//O[PTIMAL] APPROACH
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val)
                current.next = current.next.next; // skip duplicate
            else
                current = current.next; // move forward
        }
        return head;
    }
}