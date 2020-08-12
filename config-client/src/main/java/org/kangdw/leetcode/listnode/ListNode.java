package org.kangdw.leetcode.listnode;

/**
 * java链表
 */
public class ListNode {

    Node node = null;

    /**
     * 为链表增加节点
     *
     * @param data
     * @return
     */
    public Node addNode(int data) {
        Node node = new Node(data);
        if (this.node != null) {
            node.next = this.node;
        }
        this.node = node;
        return node;
    }

    /**
     * 获取Node的大小
     *
     * @return
     */
    public int size() {
        int size = 0;
        Node next = this.node;
        while (next != null) {
            next = next.next;
            size++;
        }
        return size;
    }

    /**
     * 删除一个节点
     *
     * @param index
     * @return
     */
    public Node deleteNode(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("index cant < 0");
        }
        int i = 0;
        while (node != null) {
            node = node.next;
            if (i == index) {
                return node;
            }
            i++;
        }
        throw new IllegalArgumentException("index cant >  max size");
    }

}
