package org.kangdw.leetcode.listnode;

import java.util.Stack;

public class RevertListNode {
    //1 ->2 ->3->null
    //3 ->2 ->1 ->null
    public Node reverseList(Node head) {
        Node node = head.next;                 //12345   2345  345  45  5
        if (node.next != null) {
            reverseList(node);
        }
        return node.next=new Node(head.val);
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.addNode(5);
        listNode.addNode(4);
        listNode.addNode(3);
        listNode.addNode(2);
        listNode.addNode(1);
        System.out.println(listNode.size() + "-------------");
        Stack<Integer>  stack=new Stack();
        stack.push(1);

    }


}
