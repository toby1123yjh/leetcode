package com.yjh.linklist;

public class linklist_206 {
    public ListNode reverseList(ListNode head) {
        ListNode p=head;
        if(head==null){
            return head;
        }
        ListNode q=head.next;
        p.next=null;
        if(q==null){
            return p;
        }
        ListNode temp=q.next;
        if(temp==null){
            q.next=p;
            return q;
        }
        while(temp!=null){
            q.next=p;
            p=q;
            q=temp;
            temp=temp.next;
        }
        q.next=p;
        return q;
    }
}
