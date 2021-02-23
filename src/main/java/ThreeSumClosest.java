import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，
 * 使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 *
 *
 * 解决：1、首先对数组做排序；
 *      2、然后按照第一个数据出一个锚点数据和；
 *      3、双指针遍历，从start=i+1;和end-1开始，若和小于ans这更新该值
 *      4、返回ans
 *
 *
 */
public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] nums = new int[]{-3, 0, 1, 2};
        int s = threeSumClosest(nums, 1);
        System.out.printf("\nsu:" + s + "\n");
    }


    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }
                if (sum < target) {
                    start++;
                } else if (sum > target) {
                    end--;
                } else {
                    return ans;
                }
            }
        }

        return ans;

    }
}
