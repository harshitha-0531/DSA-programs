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
    public ListNode rotateRight(ListNode head, int k) {
        
        if (head==null) return head;
        ListNode temp =head;
        int len=0;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }  
        temp.next=head;
        k=k%(len+1);
        int jump=len-k;
    ListNode  p =head;
        while(jump>0){
            p=p.next;
            jump--;

        }
        ListNode res=p.next;
        p.next=null;
        return res;
        
    }
}
