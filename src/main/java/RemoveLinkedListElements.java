/***
 *删除链表中的节点
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 *
 * 输入: head = [4,5,1,9], node = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 *
 *
 * 输入: head = [4,5,1,9], node = 1
 * 输出: [4,5,9]
 * 解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
 *
 *
 * 链表至少包含两个节点。
 * 链表中所有节点的值都是唯一的。
 * 给定的节点为非末尾节点并且一定是链表中的一个有效节点。
 * 不要从你的函数中返回任何结果。
 *
 */
public class RemoveLinkedListElements {
    static ListNode head = null;

    public static void main(String[] args) {
        head = new ListNode(4);
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(9);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        ListNode node = new ListNode(5);

        deleteNode(node);
        while (head != null) {
            System.out.printf("node:" + head.val + "\n");
            head = head.next;
        }

    }


    public static void deleteNode(ListNode node) {
        if (head.val == node.val) {
            head = head.next;
        }

        ListNode p = head;
        ListNode nextNode = p.next;
        while (nextNode != null) {
            if (nextNode.val == node.val) {
                p.next = nextNode.next;
                break;
            }
            nextNode = nextNode.next;
            p = p.next;
        }

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
