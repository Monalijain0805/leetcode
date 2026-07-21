/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode dummy = new ListNode(100);
//         ListNode temp = dummy;
//         ListNode temp1= list1;
//         ListNode temp2= list2;
//         while(temp1!=null && temp2!=null){
//             if(temp1.val <= temp2.val){
//                 temp.next=temp1;
//                 temp1=temp1.next;
//             }
//             else{
//                 temp.next=temp2;
//                 temp2=temp2.next;
//             }
//             temp=temp.next;
//         }
//         if(temp1==null) temp.next=temp2;
//         else temp.next=temp1;
//         return dummy.next;
//     }
// }


 class Solution {
   public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode(100);
    ListNode t1= list1;
    ListNode t2= list2;
    ListNode t= dummy;
    while(t1!=null && t2!=null){
        if(t1.val<=t2.val){
            t.next= t1;
            t1= t1.next;
            t= t.next;
        }
        else{
            t.next= t2;
            t2= t2.next;
            t= t.next;
        }
    }
    if(t1==null){
        t.next=t2;
    }
    if(t2==null){
        t.next= t1;
    }
    return dummy.next;
   }
 }