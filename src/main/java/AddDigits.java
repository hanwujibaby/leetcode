/**
 *
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

 For example:

 Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * Created by weixing on 17/11/21.
 */
public class AddDigits {
  public static void main(String[] args) {

  }

  public int addDigits(int num) {
    return (num-1)%9+1;
  }

}
