/***
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 *
 *
 * 输入: 27
 * 输出: true
 *
 *
 * 输入: 0
 * 输出: false
 *
 * 你能不使用循环或者递归来完成本题吗？
 *
 *
 * 题解：3的幂次质因子只有3，而整数范围内的3的幂次最大是1162261467
 * 骚得一皮
 */

public class PowerOfThree {

    public static void main(String[] args) {

        System.out.printf("k："+isPowerOfThree(27));

    }


    public static  boolean isPowerOfThree(int n) {

        return n > 0 && 1162261467 % n == 0;
    }
}
