public class Solution {
    public ListNode getIntersectionNode(ListNode l1, ListNode l2) {

        if (l1 == null || l2 == null) {
            return null;
        }

        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p1 != p2) {
            p1 = (p1 == null) ? l2 : p1.next;
            p2 = (p2 == null) ? l1 : p2.next;
        }

        return p1;
    }
}