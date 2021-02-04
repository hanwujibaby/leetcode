import java.util.HashMap;

/***
 *
 *  两数之和 II - 输入有序数组
 *  给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 *
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 *
 * 说明:
 *
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 示例:
 *
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 *
 *
 * Solution: 遍历数组后将数组下标放入bucket，然后再次遍历数组后判断下target-numbers[i]是否存在于bucket中，若存在的话返回下标。时间复杂度2*O(n)
 * ,空间复杂度O(n).
 *
 */

public class TwoSum2 {
    public static void main(String[] args) {
        int[] n = new int[]{2, 7, 11, 15};
        int[] a = new int[2];

        Long start = System.currentTimeMillis();
        a = twoSum(n, 13);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[" + i + "]:" + a[i] + "\n");
        }
        Long end = System.currentTimeMillis();
        System.out.printf("over cost:" + (end - start) + "ms");

    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] a = new int[2];
        /*
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == target - numbers[i]) {
                    a[1] = j + 1;
                    a[0]=i+1;
                    break;
                }
            }
        }
        */
        HashMap<Integer, Integer> bucket = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            bucket.put(numbers[i], i + 1);
        }
        for (int i = 0; i < numbers.length; i++) {
            int k = target - numbers[i];
            if (bucket.containsKey(k)) {
                a[0] = i + 1;
                a[1] = bucket.get(k);
                break;
            }
        }
        return a;
    }
}
