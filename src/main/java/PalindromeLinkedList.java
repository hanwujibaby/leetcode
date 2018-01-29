/**
 *
 * Given a singly linked list, determine if it is a palindrome.
 * Follow up: Could you do it in O(n) time and O(1) space?
 * Created by weixing on 18/1/27.
 */
public class PalindromeLinkedList {


  public static void main(String[] args) {


  }


  public boolean isPalindrome(ListNode head) {
    if(head==null||head.next==null){
      return true;
    }
    int length=0;

    ListNode node=head;
    return false;

  }


  class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
}






