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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode finale = new ListNode(0);
        ListNode temp = finale;
        ListNode dummy = new ListNode();

        int carry = 0;
        while(true){

            if(l1 == null  && l2 == null){
                if(carry!=0){
                    temp.next = new ListNode(carry);
                    temp = temp.next;
                }
                break;
            } 
            int a =0;
            int b =0;
            
            if(l1 != null){
                a = l1.val;
                l1 = l1.next;
            }
           
            
            if(l2 != null){
                b = l2.val;
                l2 = l2.next;
            }
            System.out.println(\a+b+carry ->\+(a+b+carry));

            if((a+b+carry)/10 > 0){
                
                System.out.println(\a\+a);
                System.out.println(\b\+b);
                dummy = new ListNode( (a+b+carry) % 10);
                carry = (a+b+carry) / 10 ;
                System.out.println(\carry\+carry);
                System.out.println(\dummyvalue->\+dummy.val);
            }
            else{
                System.out.println(\a\+a);
                System.out.println(\b\+b);
                dummy = new ListNode(a+b+carry);
                carry = 0;
                System.out.println(\dummyvalue->\+dummy.val);
            }


             
            temp.next = dummy;
            temp = temp.next;

        }

        return finale.next;
    }
}