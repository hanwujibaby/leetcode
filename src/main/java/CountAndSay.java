/**
 * Created by wei4liverpool on 12/15/16.
 * The count-and-say sequence is the sequence of integers beginning as follows:
 1, 11, 21, 1211, 111221, ...

 1 is read off as "one 1" or 11.
 11 is read off as "two 1s" or 21.
 21 is read off as "one 2, then one 1" or 1211.
 Given an integer n, generate the nth sequence.

 Note: The sequence of integers will be represented as a string.
 *
 */
public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countNSay(5));

    }

    public static String countNSay(int n){
        String str=new String();

        if(n<0){
            return "not valid number";
        }

        if(n==1){
            return "1";
        }else{
            String preStr=countNSay(n-1);
            char[] preStrChars=preStr.toCharArray();
            StringBuffer sb=new StringBuffer();

            for(int i=0,j=i;i<preStrChars.length;){
                int k=0;
                while(j<preStrChars.length && preStrChars[i]==preStrChars[j]){
                    k++;
                    j++;
                }
                sb.append(k).append(preStrChars[i]);
                i=j;
            }
            return sb.toString();

        }

    }


}
