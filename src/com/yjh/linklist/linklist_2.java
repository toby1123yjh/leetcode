package com.yjh.linklist;

public class linklist_2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode L=new  ListNode(0);
        ListNode p=l1,q=l2,temp=L;
        int cur=0;
        while(p!=null||q!=null){
            int x=(p!=null)?p.val:0;
            int y=(q!=null)?q.val:0;
            int sum=x+y+cur;
            cur=sum/10;
            temp.next=new ListNode(sum%10);
            if(p!=null) {
                p=p.next;
            }
            if(q!=null){
                q=q.next;
            }
            temp=temp.next;
        }
        if(cur>0){
            temp.next=new ListNode(cur);
        }
        return L.next;
    }

    public static void main(String[] args) {
            ListNode l1=new ListNode(2);
            ListNode l2=new ListNode(4);
            ListNode l3=new ListNode(3);
            ListNode l4=new ListNode(5);
            ListNode l5=new ListNode(6);
            ListNode l6=new ListNode(4);
            l1.next=l2;
            l2.next=l3;
            l4.next=l5;
            l5.next=l6;
            ListNode l=addTwoNumbers(l1,l4);
            ListNode temp=l;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
    }
}
