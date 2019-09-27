/**
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1
 * <p>
 * 示例 1:
 * <p>
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 * <p>
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题
 * solution:将长的字符串减去短的字符串后，再比较，简单的双重循环即可
 * 这样就可以了。
 */
public class Impment_strStr {

    public static void main(String[] args) {

        String h = "aaaaa";
        String r = "bba";
        System.out.println("index:" + strStr(h, r));

    }

    public static int strStr(String haystack, String needle) {
        if (needle == null) {
            return 0;
        }
        char[] hays = haystack.toCharArray();
        char[] needs = needle.toCharArray();
        if (needs.length > hays.length) {
            return -1;
        }
        if (needs.length == 0 || haystack.length() == 0) {
            return 0;
        }
        int index = -1;
        boolean flag = false;

        for (int i = 0; i <= hays.length - needs.length; i++) {
            index = i;
            int j = 0;
            for (; j < needs.length; j++) {
                if (hays[i] == needs[j]) {
                    i++;
                } else {
                    i = index;
                    break;
                }
            }
            if (j == needs.length) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return index;
        }


        return -1;
    }
}
