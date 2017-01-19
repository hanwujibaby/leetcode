/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.


 For example, the following two linked lists:

 A:          a1 → a2
                     ↘
                     c1 → c2 → c3
                    ↗
 B:     b1 → b2 → b3
 begin to intersect at node c1.

 Notes:

 If the two linked lists have no intersection at all, return null.
 The linked lists must retain their original structure after the function returns.
 You may assume there are no cycles anywhere in the entire linked structure.
 Your code should preferably run in O(n) time and use only O(1) memory.



 *
 * Created by wei4liverpool on 1/17/17.
 */
public class Intersection_Of_Two_Linked_Lists {
    public static void main(String[] args) {
        ListNode a1=new ListNode(1);
        ListNode a2=new ListNode(2);
        ListNode a3=new ListNode(3);
        ListNode c1=new ListNode(4);
        ListNode c2=new ListNode(5);
        ListNode c3=new ListNode(6);
        a1.next=a2;
        a2.next=a3;
        a3.next=c1;
        c1.next=c2;
        c2.next=c3;


        ListNode b1=new ListNode(7);
        ListNode b2=new ListNode(8);
        ListNode b3=new ListNode(9);

        b1.next=b2;
        b2.next=b3;
        b3.next=c1;

        ListNode node=getIntersectionNode(a1,b1);
        if(node==null){
            System.out.println("Intersection Node:"+node);
        }else{
            System.out.println("Intersection Node:"+node.val);
        }

    }


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node=null;
        int lenA=getLen(headA);
        int lenB=getLen(headB);
        int start=Math.abs(lenA-lenB);
        int i=0;
        if(lenA>lenB){
            while(i<start){
                headA=headA.next;
                i++;
            }
        }else{
            while(i<start){
                headB=headB.next;
                i++;
            }
        }

        while(headA!=null && headB!=null){
            if(headA.val==headB.val){
                if(node==null){
                    node=headA;
                }

            }else{
                node=null;
            }
            headA=headA.next;
            headB=headB.next;
        }

        return node;
    }

    public static class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                     val = x;
                     next = null;
             }
    }

    public static int getLen(ListNode head){
        int len=0;
        if(head==null){
            return len;
        }
        while(head.next!=null){
            len++;
            head=head.next;
        }
        return len;
    }

}
