/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;

        ListNode fast = head.next;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            if(slow == fast)
                return true;
            fast = fast.next.next;
            slow = slow.next;
        }

        return false;

    }
}
// @lc code=end

