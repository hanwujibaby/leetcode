/**
 * Compare two version numbers version1 and version2.
 If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

 You may assume that the version strings are non-empty and contain only digits and the . character.
 The . character does not represent a decimal point and is used to separate number sequences.
 For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

 Here is an example of version numbers ordering:

 0.1 < 1.1 < 1.2 < 13.37
 * Created by wei4liverpool on 1/16/17.
 */
public class CompareVersionNumbers {
    public static void main(String[] args) {
        String v1="1.1.1";
        String v2="1.1.0";

        System.out.println("version1:"+v1+"\nversion2:"+v2+"\ncompareResult:"+compareVersion(v1,v2));

    }


    public static int compareVersion(String version1, String version2) {
        if(version1==null && version2==null){
            return 0;
        }

        if(version1==null && version2!=null){
            return -1;
        }

        if(version1!=null && version2==null){
            return 1;
        }

        String[] v1s= version1.split("\\.");
        String[] v2s= version2.split("\\.");
        int i=0;

        for(i=0;i<v1s.length&&i<v2s.length;i++){
            int value1=Integer.valueOf(v1s[i]);
            int value2=Integer.valueOf(v2s[i]);
            if(value1>value2){
                return 1;
            }else if (value1<value2){
                return -1;
            }
        }

        if(v1s.length==v2s.length){
            int v1=Integer.valueOf(v1s[i-1]);
            int v2=Integer.valueOf(v2s[i-1]);
            if(v1==v2){
                return 0;
            }else{
                return v1>v2?1:-1;
            }
        }else{
            if(v1s.length<v2s.length){
                for(;i<v2s.length;i++){
                    int v=Integer.valueOf(v2s[i]);
                    if(v>0){
                        return -1;
                    }
                }
            }else{
                for(;i<v1s.length;i++){
                    int v=Integer.valueOf(v1s[i]);
                    if(v>0){
                        return 1;
                    }
                }
            }
        }
        return 0;

    }
}
