/**
 * Created by wei4liverpool on 12/8/16.
 */
public class StringToInteger {

    public static void main(String[] args) {
        //System.out.println(Integer.parseInt("  +000001230a43"));
        System.out.println(parse("     +0001230"));
    }

    public static Integer parse(String str) {
        if (str == null) {
            throw new NumberFormatException();
        }

        char[] strs = str.trim().toCharArray();
        int len = strs.length;
        boolean negative=false;

        if (strs.length == 0) {
            //throw new NumberFormatException();
            return 0;
        }

        if (len >=1) {
            char firstChar = strs[0];
            int startIndex = 0;
            int sum = 0;
            if (firstChar == '-') {
                negative = true;
                startIndex = 1;
                if(len==1){
                    return 0;
                }
            } else if (firstChar =='+') {
                startIndex = 1;
                if(len==1){
                    return 0;
                }
            }

            while(Character.isDigit(strs[startIndex])){
                if(Character.digit(strs[startIndex],10)==0){
                    startIndex++;
                }
                else{
                    break;
                }
            }

            while (startIndex < len) {
                if (Character.isDigit(strs[startIndex])) {
                    int n = Character.digit(strs[startIndex], 10);
                    int factor = 1;
                    for (int k = startIndex; k < len-1;k++) {
                        factor *= 10;
                    }
                    sum += n * factor;
                    if (sum < 0) {
                        return 0;
                    }
                } else {
                    return negative==true? sum*-1:sum;
                }
                startIndex++;
            }

            return negative==true? sum*-1:sum;
        }
        return 0;


    }




}
