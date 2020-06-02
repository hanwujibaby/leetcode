
/***
 *
 * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
 *
 * 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
 *
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 *
 * 说明:
 *
 * 你可以假设数组不可变。
 * 会多次调用 sumRange 方法。
 *
 *   Your NumArray object will be instantiated and called as such:
 *   NumArray obj = new NumArray(nums);
 *   int param_1 = obj.sumRange(i,j);
 */
public class RangeSumQuery {
    private int[] nums;

    public static void main(String[] args) {
        int[] nums=new int[]{-2, 0, 3, -5, 2, -1};
        RangeSumQuery rangeSumQuery=new RangeSumQuery(nums);
        int s=rangeSumQuery.sumRange(0,5);
        System.out.println("n:"+s);

    }


    public RangeSumQuery(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (int k = 0; k < nums.length; k++) {
            sum += nums[k];
        }

        int preI = 0;
        for (int m = 0; m < i; m++) {
            preI += nums[m];
        }

        int altN = 0;
        for (int n = j + 1; n < nums.length; n++) {
            altN += nums[n];
        }
        return sum - preI - altN;
    }
}
