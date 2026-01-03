import LinkedList.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode newhead = null;

        while(current != null){
            newhead = new ListNode(current.val, newhead);
            current = current.next;
        }

        return newhead;
    }

}
