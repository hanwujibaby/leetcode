/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.

 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.

 For the purpose of this problem, we define empty string as valid palindrome.
 * Created by wei4liverpool on 1/14/17.
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String s="..";
        String s1="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s1));

    }

    public static boolean isPalindrome(String s) {
        char[] chars=s.trim().toLowerCase().toCharArray();
        int i=0;
        int j=chars.length-1;
        boolean b=true;
        if(s==null || chars.length==0){
            return true;
        }

        while(i<=j){

            while(i<chars.length&&!isLetter(chars[i])){
                i++;
            }
            if(i==chars.length){
                return false;
            }

            while(!isLetter(chars[j])){
                j--;
            }


            if(chars[i]==chars[j]){
                i++;j--;
            }else{
                b=false;
                break;
            }

        }
        return b;

    }

    static boolean isLetter(char c){
        return Character.isDigit(c)||Character.isLetter(c);
    }


}
