class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        int move;
        if (count % 2 == 0) {
            move = count / 2;      // Even
        } else {
            move = count / 2;      // Odd
        }

        for (int i = 0; i < move; i++) {
            temp = temp.next;
        }

        return temp;
    }
}