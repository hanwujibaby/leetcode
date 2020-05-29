/***
 *
 * 缺失数字
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 * 输入: [3,0,1]
 * 输出: 2
 *
 *
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 *
 * 你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
 * //数学的解法：求0-n的总和后减去数组的所有数据就是缺失的数据,相当于等差数列求和：(上底+下底的和*高）/2
 */
public class MissingNumber {

    public static void main(String[] args) {
        int[] n = new int[]{9,6,4,2,3,5,7,0,1};
        int s = missingNumber(n);
        System.out.printf("sum:" + s);

    }

    public static int missingNumber(int[] nums) {
        int sum = ((nums.length +1)* (0 + nums.length)) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum = sum - nums[i];
        }
        return sum;
    }
}
