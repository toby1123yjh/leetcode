package com.yjh.linklist;

public class linklist_21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode p=l1,q=l2;
        ListNode temp,start;
        if(p.val>q.val){
            start=q;
            temp=q;
            q=q.next;
        }else{
            start=p;
            temp=p;
            p=p.next;
        }
        while(p!=null&&q!=null){
            if(p.val<q.val){
                temp.next=p;
                temp=p;
                p=p.next;
            }else{
                temp.next=q;
                temp=q;
                q=q.next;
            }
        }
        if(p!=null){
            temp.next=p;
        }
        if(q!=null){
            temp.next=q;
        }
        return start;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(-9);
        ListNode l2=new ListNode(3);
//        ListNode l3=new ListNode(4);
        ListNode l4=new ListNode(5);
        ListNode l5=new ListNode(7);
//        ListNode l6=new ListNode(4);
        l1.next=l2;
//        l2.next=l3;
        l4.next=l5;
//        l5.next=l6;
        ListNode temp=mergeTwoLists(l1,l4);
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
