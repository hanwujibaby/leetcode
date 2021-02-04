import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/***
 *给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 *
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 *
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 *
 * 输入:
 * [4,3,2,7,8,2,3,1]
 *
 * 输出:
 * [5,6]
 *
 */
public class findDisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        long s1 = System.currentTimeMillis();
        List<Integer> list = findDisappearedNumbers(nums);
        long s2 = System.currentTimeMillis();
        System.out.println("cost:" + (s2 - s1));
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.printf(it.next() + ",");
        }

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int[] m = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            m[nums[i]]=nums[i];
        }

        for(int i=1;i<m.length;i++){
            if(m[i]==0){
                list.add(i);
            }
        }

        return list;
    }
}
