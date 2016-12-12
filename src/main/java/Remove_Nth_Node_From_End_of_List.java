import java.util.LinkedList;

/**
 * Created by wei4liverpool on 12/12/16.
 *
 * Given a linked list, remove the nth node from the end of list and return its head.

 For example,

 Given linked list: 1->2->3->4->5, and n = 2.

 After removing the second node from the end, the linked list becomes 1->2->3->5.
 Note:
 Given n will always be valid.
 Try to do this in one pass.

 */
public class Remove_Nth_Node_From_End_of_List {
    /**
     * 链表充值节点即可
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        while(linkedList.isEmpty()==false){
            System.out.println(linkedList.pop());
        }

    }


    public static  void removeNthNode(LinkedList<Integer> linkedList,int n){


    }
}
