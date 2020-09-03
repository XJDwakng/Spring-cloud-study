package org.kangdw.leetcode.listnode;

public class MergeListNode {
    //1—>2->4   1->3->4
    public static Node mergeTwoLists(Node l1, Node l2) {
        Node prehead = new Node(-1);

        Node prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.addNode(4);
        l1.addNode(2);
        Node n1 = l1.addNode(1);

        ListNode l2 = new ListNode();
        l2.addNode(4);
        l2.addNode(3);
        Node n2 = l2.addNode(1);

        Node node = mergeTwoLists(n1, n2);

    }
}
