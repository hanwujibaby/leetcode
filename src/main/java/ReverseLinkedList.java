/***
 * 反转链表
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class ReverseLinkedList {



    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = null;
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;


        reverseList(head);

        while (head != null) {
            System.out.println("node:" + head.val + "\n");
            head = head.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        ListNode preNode = null;
        while (currNode != null) {
            ListNode tmpNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = tmpNode;
        }

        head = preNode;
        return head;
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
