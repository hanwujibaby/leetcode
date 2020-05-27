/***
 *
 *
 给定一个链表，判断链表中是否有环。

 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。

 输入：head = [3,2,0,-4], pos = 1
 输出：true
 解释：链表中有一个环，其尾部连接到第二个节点。


 3-->2-->0--> -4
 ^
 |_ _  _ __|

 */
public class LinkedListCycle {
    public static void main(String[] args) {
        /*
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        */

        ListNode head=new ListNode(1);
        ListNode node1=new ListNode(2);
        node1.next=head;

        System.out.printf("hasCycle:" + hasCycle(head));

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        boolean result = false;
        if (head.next == null) {
            return result;
        }

        ListNode nextNode = head.next;
        ListNode next2Node = nextNode.next;
        if (next2Node == null) {
            return result;
        }

        while (nextNode != null && next2Node != null) {
            if (nextNode.equals(next2Node)) {
                result = true;
                break;
            }
            nextNode = nextNode.next;
            if (next2Node.next != null) {
                next2Node = next2Node.next.next;
            }

        }

        return result;
    }
}
