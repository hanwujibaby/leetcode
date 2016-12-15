/**
 * Created by wei4liverpool on 12/14/16.
 * Implement strStr().

 Returns a pointer to the first occurrence of needle in haystack, or null if needle is not part of haystack.
 判断一个字符串是不是另一个字符串的子串

 */
public class StrStr {

    public static void main(String[] args) {
        System.out.println(isSubString("aababcdef","abcded"));


    }



    public static boolean isSubString(String origin,String targetStr){
        boolean flag=false;
        if(origin.length()<targetStr.length()){
            return false;
        }

        char[] originChars=origin.toCharArray();
        char[] targetChars=targetStr.toCharArray();
        int i=0;
        int j=0;

        for(i=0;i<originChars.length;i++){
            for(j=0;j<targetChars.length;j++){
                if(originChars[i+j]!=targetChars[j]){
                    break;
                }
            }
            if(j==targetChars.length){
                break;
            }
        }

        return j==targetChars.length;

    }

}
