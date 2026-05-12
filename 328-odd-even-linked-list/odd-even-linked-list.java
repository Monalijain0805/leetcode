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
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1=new ListNode(-1);
        ListNode dummy2=new ListNode(-1);
        ListNode temp=head;
        ListNode tempOdd=dummy1;
        ListNode tempEven=dummy2;
        int index=1;
        while(temp!=null){
            if(index%2==1){
              tempOdd.next=temp;
              tempOdd=tempOdd.next;
            }
           else{
              tempEven.next=temp;
              tempEven=tempEven.next;
            }
            temp=temp.next;
            index++;
        }

        // edge cases
        if (dummy1.next == null) return dummy2.next;
        if (dummy2.next == null) return dummy1.next;
 

        tempOdd.next=dummy2.next;
        tempEven.next=null;
        return dummy1.next;

    }
}