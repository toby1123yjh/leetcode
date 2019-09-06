package com.yjh.linklist;

public class linklist_237 {
    class ListNode{
           int val;
           ListNode next;
           ListNode(int x) { val = x; }
    }
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
