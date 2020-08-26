package org.kangdw.leetcode.listnode;

/**
 * 节点
 */
public class Node {
    Node next;
    int val;

    public Node() {

    }


    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.next = next;
        this.val = val;
    }
}
