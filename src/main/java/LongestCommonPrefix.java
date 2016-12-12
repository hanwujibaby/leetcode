/**
 * Created by wei4liverpool on 12/11/16.
 * Write a function to find the longest common prefix string amongst an array of strings.

 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(findLongestCommonPrefix(new String[]{"abcde","abcd","abf"}));

    }


    public static String findLongestCommonPrefix(String[] strings){

        if(strings==null){
            return "";
        }

        if(strings.length==0){
            return "";
        }

        String originStr=strings[0];
        char[] originChar=originStr.toCharArray();
        int i=0;
        for(int j=1;i<originChar.length&&j<strings.length;i++,j++){
                if(i<strings[j].toCharArray().length&& originChar[i]!=strings[j].charAt(i)){
                    break;
                }
        }

        return strings[0].substring(0,i);

    }

}
