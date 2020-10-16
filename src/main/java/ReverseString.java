/***
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 *
 *
 * 输入：["H","a","n","n","a","h"]
 * 输出：["h","a","n","n","a","H"]
 */

public class ReverseString {

    public static void main(String[] args) {

        //char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        //char[] s = new char[]{'H', 'a', 'n', 'n', 'a','h'};
        //char[] s = new char[]{'H'};
        String[] s=new String[]{"a","m","a","n","a","P"," ",":","l","a","n","a","c"," ","a"," ",",","n","a","l","p"," ","a"," ",",","n","a","m"," ","A"};
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length;i++){
            sb.append(s[i]);
        }
        char[] s1=sb.toString().toCharArray();
        reverseString(s1);

        for (int i = 0; i < s.length; i++) {
            System.out.print('"'+s[i]+'"'+",");
        }

    }

    public static void reverseString(char[] s) {
        int mid = (0 + s.length - 1) / 2;
        System.out.printf("length:"+s.length+"\t"+mid+"\n");
        char tmp;
        for (int i = 0, j = s.length - 1; i <= mid && j > i; i++, j--) {
            tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }

}
