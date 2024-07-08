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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode curr = head;
        ListNode temp = head.next;
        ListNode check = null;

        while(curr.next != null){
           // sum = 0;
            while(temp.val != 0){
                sum += temp.val;
                temp = temp.next;
            }
        curr.val = sum;
        curr.next = temp;
        check = curr;
        curr = curr.next;
        temp = curr.next;
        sum=0;
        }
    check.next=null;
    return head;
    }
}