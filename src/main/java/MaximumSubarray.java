import java.util.Arrays;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * solution:分治算法：连续子数组必然会存在于mid的索引的0-left,mid+1-right和包含mid,mid+1的数组处
 */
public class MaximumSubarray {


    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("\ndata:" + maxSubArray(nums, 0, nums.length - 1) + "\n");

    }

    public static int maxSubArray(int[] nums, int left, int right) {

        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        return getMaxArray(nums, left, right);
    }

    public static int maxCrossingSum(int[] nums, int left, int mid, int right) {

        int midLeft = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            if (midLeft < sum) {
                midLeft = sum;
            }
        }

        int midRight = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum += nums[i];
            if (midRight < sum) {
                midRight = sum;
            }
        }

        return midLeft + midRight;
    }

    public static int getMaxArray(int[] nums, int left, int right) {
        int mid = (left + right) / 2;
        if (left == right) {
            return nums[left];
        }
        int leftSum = getMaxArray(nums, left, mid);
        int rightSum = getMaxArray(nums, mid + 1, right);
        int crossNum = maxCrossingSum(nums, left, mid, right);
        return getMax3(leftSum, rightSum, crossNum);
    }

    public static int getMax3(int leftNum, int rightNum, int crossNum) {
        return Math.max(leftNum, Math.max(rightNum, crossNum));
    }

}
