class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        if(c==1)
        
            return null;

        c=c/2;
        temp=head;
        while(c>1)
        {
            temp=temp.next;
            c--;
        }
        temp.next=temp.next.next;

        return head;
        
    }
}