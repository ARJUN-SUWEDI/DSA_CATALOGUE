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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=get(head);
        ListNode r=mid.next;
        mid.next=null;
        ListNode nl=sortList(head);
        ListNode nr=sortList(r);
        return merge(nl,nr);
    }
    public ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy= new ListNode(-1);
        ListNode temp = dummy;
        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                temp.next = head1;
                head1 = head1.next;
            } else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        temp.next=(head1==null)?head2:head1;

        return dummy.next;
    }
    public ListNode get(ListNode head){
        ListNode f=head.next;
        ListNode s=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
}