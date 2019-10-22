/***
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 *
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 *
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 */

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println("data:" + searchInsert(nums, 7));
    }

    public static int searchInsert(int[] nums, int target) {

        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0] < target ? 1 : 0;
        }

        int start = 0;
        int mid = 0;
        int end = nums.length - 1;
        while (start < end) {
            mid = (end - start) / 2 + start;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {

                if (mid - 1 < 0) {
                    return mid;
                }

                if (nums[mid - 1] < target) {
                    return mid;
                }
                end = end - 1;
            } else {
                start = start + 1;
            }

        }

        if (nums[end] == target) {
            return end;
        }

        if (nums[end] > target && nums[end - 1] < target) {
            return end;
        }
        if (nums[end] < target) {
            end = end + 1;
        }
        return end;
    }

}

