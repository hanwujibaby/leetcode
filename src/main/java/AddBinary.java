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
        int a=1;
        //System.out.println(Integer.toString(a).charAt(0));
        String s=addBinary("11","1");
        System.out.println(s);


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

        String lStr=a.length()>=b.length()?a:b;
        String sStr=a.length()<b.length()?a:b;


        char[] lChars=lStr.toCharArray();
        char[] sChars=sStr.toCharArray();
        char[] finalChars= new char[lChars.length+1];

        for(int i=sChars.length-1,j=lChars.length-1;j>=0;i--,j--){

            int result=i<0?(Character.digit(lChars[j],10)): Character.digit(sChars[i],10)+Character.digit(lChars[j],10);
            if(result==2){
                if(j!=0){
                    lChars[j-1]=Integer.toString(Character.digit(lChars[j-1],10)+1).charAt(0);
                    lChars[j]='0';

                }else{
                    System.arraycopy(lChars,0,finalChars,1,lChars.length);
                    finalChars[0]='1';
                    finalChars[j+1]='0';
                }
            }else if(result==3){
                if(j!=0){
                    lChars[j-1]=Integer.toString(Character.digit(lChars[j-1],10)+1).charAt(0);
                    lChars[j]='1';
                }else{
                    System.arraycopy(lChars,0,finalChars,1,lChars.length);
                    finalChars[0]='1';
                    finalChars[j+1]='1';

                }
            }else{
                if(i<0){
                    lChars[j]=Integer.toString(Character.digit(lChars[j],10)).charAt(0);

                }else{
                    lChars[j]=Integer.toString(Character.digit(lChars[j],10)+Character.digit(sChars[i],10)).charAt(0);
                }
            }

        }

        return finalChars[0]=='1'?String.copyValueOf(finalChars) :String.copyValueOf(lChars);
    }

}
