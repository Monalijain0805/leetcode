/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode A, ListNode B) {
        ListNode p1 = A;
        ListNode p2 = B;
        int countp1 = 0;
        while (p1 != null) {
            countp1++;
            p1 = p1.next;
        }
        int countp2 = 0;
        while (p2 != null) {
            countp2++;
            p2 = p2.next;
        }
        p1 = A;
        p2 = B;
        int diff = countp1 - countp2;
        if (countp1 > countp2) {
            while (diff > 0) {
                p1 = p1.next;
                diff--;
            }
        } else {
            diff = countp2 - countp1;
            while (diff > 0) {
                p2 = p2.next;
                diff--;
            }
        }
        while (p1 != null && p2 != null) {
            if (p1 == p2) {
                return p1;
            }
            p1= p1.next;
            p2 =p2.next;
        }

        return null;
    }
}