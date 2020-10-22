import java.util.*;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 示例1：
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * <p>
 * 示例2:
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 * 说明：
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 */
public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        int[] m = intersection(nums1, nums2);
        for (int i = 0; i < m.length; i++) {
            System.out.printf(m[i] + "\t");
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> bigHash = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> smallHash = new HashMap<Integer, Integer>();
        if (nums1.length > nums2.length) {
            for (int i = 0; i < nums1.length; i++) {
                bigHash.put(nums1[i], 1);
            }
            for (int j = 0; j < nums2.length; j++) {
                smallHash.put(nums2[j], 1);
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
                bigHash.put(nums2[i], 1);
            }

            for (int j = 0; j < nums1.length; j++) {
                smallHash.put(nums1[j], 1);
            }

        }
        Iterator<Map.Entry<Integer, Integer>> smallIT = smallHash.entrySet().iterator();
        List<Integer> list = new ArrayList<Integer>();
        while (smallIT.hasNext()) {
            int v = smallIT.next().getKey();
            if (bigHash.get(v) != null) {
                list.add(v);
            }
        }
        int[] m = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            m[i] = list.get(i);
        }
        return m;

    }
}
