/**
 * Given a singly linked list, determine if it is a palindrome.
 * Follow up: Could you do it in O(n) time and O(1) space?
 * Created by weixing on 18/1/27.
 */
public class PalindromeLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(1);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        //ListNode midNode = findMideNode(head);
        //System.out.println("midNode:" + midNode.val);

        System.out.println("result:\t" + isPalindrome(head));


    }


    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slowNode = head;
        ListNode fastNode = head.next.next;
        while (fastNode != null) {
            slowNode = slowNode.next;
            if (fastNode.next == null) {
                break;
            } else {
                fastNode = fastNode.next.next;
            }
        }
        ListNode midNode = null; //此刻fastNode中间节点；
        if (fastNode != null && fastNode.next == null) {
            midNode = slowNode;
        } else {
            midNode = slowNode.next;
        }
        //链表总长度为奇数
        ListNode rvHead = null;
        ListNode _rvHead = null;
        if (fastNode != null && fastNode.next == null) {
            rvHead = midNode.next;
            _rvHead = revertList(rvHead);
        } else {
            rvHead = midNode;
            _rvHead = revertList(rvHead);
        }
        while (_rvHead != null) {
            if (head.val == _rvHead.val) {
                _rvHead = _rvHead.next;
                head = head.next;
            } else {
                return false;
            }

        }
        return true;
    }


    public static ListNode revertList(ListNode head) {
        ListNode p = head;
        if (head.next == null) {
            return p;
        }
        ListNode q = head.next;
        head.next = null;
        ListNode r = q.next;
        q.next = p;
        while (r != null) {
            p = q;
            q = r;
            r = q.next;
            q.next = p;
        }

        return q;
    }


    public static ListNode findMideNode(ListNode head) {
        //快慢指针，步长分别为1和2
        ListNode slowNode = head;
        ListNode fastNode = head.next.next;
        while (slowNode != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next == null ? null : fastNode.next.next;
        }
        return slowNode;

    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}






