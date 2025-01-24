class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode ls : lists) {
            if (ls != null) {
                pq.add(ls);
            }
        }

        ListNode head = null;
        ListNode cur = null;

        while (!pq.isEmpty()) {
            ListNode curr = pq.poll();
            if (head == null) {
                head = new ListNode(curr.val);
                cur = head;
            } else {
                cur.next = new ListNode(curr.val);
                cur = cur.next;
            }
            if (curr.next != null) {
                pq.add(curr.next);
            }
        }
        return head;
    }
}
