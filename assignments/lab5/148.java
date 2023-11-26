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

    public ListNode merge(ListNode head1 , ListNode head2){
        ListNode temp = new ListNode(-1);
        ListNode ans = temp;
        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                temp.next = head1;
                temp = head1;
                head1 = head1.next;
            }else{
                temp.next = head2;
                temp = head2;
                head2 = head2.next;
            }
        }
        while(head1 != null){
             temp.next = head1;
                temp = head1;
                head1 = head1.next;
        }
        while(head2 != null){
            temp.next = head2;
                temp = head2;
                head2 = head2.next;
        }
        return ans.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode head1 = sortList(head);
        ListNode head2 = sortList(slow);
        ListNode ans = merge(head1,head2);
        return ans;
    }

}