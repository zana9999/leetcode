import LinkedList.ListNode;


public class Solution {
    public ListNode middleNode(ListNode head) {
       
        int size = 0;
        ListNode current = head;
        while( current != null){
            size++;
            current = current.next;
        }

        int mid = 0;
        if(size %  2 == 0){
            mid = (size/2) ;
        } else {
            mid = (size/2);
        }
        current = head;

        int index = 0;
        while ( index < mid && current != null){

            current = current.next;
            index++;
        }

        ListNode newHead = current;
        
        return newHead; 
    }
}