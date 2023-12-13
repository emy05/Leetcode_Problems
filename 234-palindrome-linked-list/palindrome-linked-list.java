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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        return true;

        //middle of Linked List
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }

        //reverse right half
        slow.next=reverse(slow.next);
        slow=slow.next;

        //check whether right half and left half are equal or not

        while(slow!=null){
           if(head.val!=slow.val)
           return false;
           head=head.next;
           slow=slow.next;
        }
        return true;
    }

    // Function to reverse 
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    } 
}