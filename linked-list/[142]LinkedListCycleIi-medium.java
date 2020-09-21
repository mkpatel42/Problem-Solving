/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
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
        ListNode pos = new ListNode(-1);
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            if(slow==fast){
                return pos;
            }
            pos=slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return pos;

    }
}
// @lc code=end

