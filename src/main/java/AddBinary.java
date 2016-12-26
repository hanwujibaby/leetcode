/**
 * Created by wei4liverpool on 12/23/16.
 * Given two binary strings, return their sum (also a binary string).
 For example,
 a = "11"
 b = "1"
 Return "100".
 *
 */
public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));


    }

    public static String addBinary(String a, String b) {

        if((a==null||a.length()==0) && (b==null&& b.length()==0)){
            return "";
        }

        if((a==null||a.length()==0) && b!=null){
            return b;
        }

        if(a!=null&&(b==null||b.length()==0)){
            return a;
        }

        String lStr=a.length()>b.length()?a:b;
        String sStr=a.length()<b.length()?a:b;

        char[] lChars=lStr.toCharArray();
        char[] sChars=sStr.toCharArray();
        char[] finalChars= new char[lChars.length+1];
        int dot=0;

        for(int i=sChars.length-1,j=lChars.length-1;i>=0&&j>=0;i--,j--){
            if(Character.digit(sChars[i],10)+(Character.digit(lChars[j],10))==2){
                if(j!=0){
                    lChars[j]='0';
                }else{
                    System.arraycopy(lChars,0,finalChars,1,lChars.length);
                    lChars[0]='1';
                    lChars[i+1]='0';
                }
            }else{
                lChars[i]='1';
                break;
            }

        }

        return String.copyValueOf(finalChars);
    }

}
