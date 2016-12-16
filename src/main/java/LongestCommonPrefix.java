/**
 * Created by wei4liverpool on 12/11/16.
 * Write a function to find the longest common prefix string amongst an array of strings.

 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(findLongestCommonPrefix(new String[]{"ab","abc"}));

    }


    public static String findLongestCommonPrefix(String[] strs){
        if(strs==null){
            return "";
        }

        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }

        String originStr=strs[0];

        char[] originChar=originStr.toCharArray();
        int i=0;
        int j=1;

        int k=0;
        boolean originGreaterThanStr=false;
        for(i=0;i<originChar.length;i++){
            for(j=1;j<strs.length&& i<strs[j].length()&&originChar[i]==strs[j].charAt(i);j++){
                ;
            }

            if(j!=strs.length){
                if(i==strs[j].length()&&i<originChar.length) {
                    k = i;
                }
                else if(i<strs[j].length() && originChar[i]!=strs[j].charAt(i)){
                    k=i;
                }
                break;
            }else{
                k=i+1;
            }

        }

        return strs[0].substring(0,k).toString();
    }

}
