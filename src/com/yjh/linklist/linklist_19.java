package com.yjh.linklist;

public class linklist_19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode first=dummy;
        ListNode second=dummy;
        for(int i =1;i<=n+1;i++){
            first=first.next;
        }
        while(first!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return dummy.next;

    }

    public static void main(String[] args) {
        ListNode temp=new ListNode(1);
        ListNode l=removeNthFromEnd(temp,1);
        ListNode a=l;
        while(a!=null){
            System.out.println(a.val);
            a=a.next;
        }
    }
}
