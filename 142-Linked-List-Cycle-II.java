/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode f=head;
        ListNode s=head;
        int length=0;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                ListNode nodes=head;
                while(s!=nodes){
                   nodes= nodes.next;
                   s=s.next;
                }
                return nodes;
            }
        }
        return null;
    }
}