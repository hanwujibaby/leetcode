/**
 * Created by wei4liverpool on 12/8/16.
 */
public class StringToInteger {

    public static void main(String[] args) {
        System.out.println(parse("+12340000000000"));
    }


    public static Integer parse(String str) {


        if (str == null) {
            throw new NumberFormatException();
        }

        char[] strs = str.toCharArray();
        int i = 0, len = strs.length;
        boolean negative=false;


        if (strs.length == 0) {
            throw new NumberFormatException();
        }

        if (len > 1) {
            char firstChar = str.charAt(0);
            int startIndex = 0;
            int sum = 0;
            if (firstChar == '-') {
                negative = true;
                startIndex = 1;
            } else if (firstChar =='+') {
                startIndex = 1;
            }

            while (startIndex < len) {
                if (Character.isDigit(strs[startIndex])) {
                    int n = Character.digit(strs[startIndex], 10);
                    int factor = 1;
                    for (int k = 0; k < len - startIndex - 1; k++) {
                        factor *= 10;
                    }
                    sum += n * factor;
                    if (sum < 0) {
                        throw new NumberFormatException();
                    }
                } else {
                    throw new NumberFormatException();
                }
                startIndex++;

            }

            return negative==true? sum*-1:sum;
        }
        return 0;


    }




}
