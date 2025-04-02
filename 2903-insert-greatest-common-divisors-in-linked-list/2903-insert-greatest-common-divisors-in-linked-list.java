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
    public int GCD(int a ,int b)
    {
        int gcd=1;
        for(int i=1;i<=a &&i<=b ;i++)
        {
            if(a%i==0 && b%i==0)
                gcd=i;

        }
        return gcd;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head.next==null)
            return head;
        fast=fast.next;
        while(fast!=null)
        {
            ListNode newnode=new ListNode();
            int temp=GCD(slow.val,fast.val);
            newnode.val=temp;
            newnode.next=fast;
            slow.next=newnode;
            slow=fast;
            fast=fast.next;
        }
        return head;
        

        
    }
}