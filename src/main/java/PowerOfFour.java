/**
 * 给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。
 * <p>
 * 输入: 16
 * 输出: true
 * <p>
 * 输入: 5
 * 输出: false
 */
public class PowerOfFour {

    public static void main(String[] args) {
        int s = 64 >> 2;
        System.out.println("resule:" + isPowerOfFour(1162261466));
        //System.out.println("sum:"+s);

    }


    public static boolean isPowerOfFour(int num) {
        int n = 4;
        while ((num > 0 && n > 0) && n < num) {
            n = n << 2;
        }
        return n == num;
    }
}
