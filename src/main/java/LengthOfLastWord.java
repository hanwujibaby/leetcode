/**
 * Created by wei4liverpool on 12/21/16.
 *
 *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 For example,
 Given s = "Hello World",
 return 5.

 test case:""; " ";"a ";" aa" ;" a cd";"  aa a   aa";" a  ";
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(findLengthOfLastWord(" a cd"));
    }

    public static int findLengthOfLastWord(String text){
        int i=0;
        int len=text.length();
        int count=0;
        int j=0;

        if(len==0){
            return 0;
        }

        char[] chars=text.toCharArray();
        if(len==1 && chars[0]==' '){
            return 0;
        }

        for(i=chars.length-1;i>=0;i--){
            if(chars[i]!=' '){
                count++;
                j=i;
            }else{
                if(i<j){
                    break;
                }
            }
        }


        return count;
    }


}
