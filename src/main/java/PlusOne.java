/**
 * Created by wei4liverpool on 12/22/16.
 * Given a non-negative number represented as an array of digits, plus one to the number.

    The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] dg=plusOne(new int[]{1,9});
        for(int i=0;i<dg.length;i++){
            System.out.println(dg[i]);
        }

    }

    public static int[] plusOne(int[] digits) {

        if(digits==null || digits.length==0){
            return new int[]{1};
        }

        int dot=digits.length-1;
        int[] newDigits=new int[digits.length+1];

        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]+1==10){
                if(i!=0){
                    dot=i-1;
                    digits[i]=0;
                }else{
                    System.arraycopy(digits,0,newDigits,1,digits.length);
                    newDigits[0]=1;
                    newDigits[i+1]=0;
                }
            }else{
                digits[i]=digits[i]+1;
                break;
            }
        }

        if(newDigits[0]>0){
            return newDigits;
        }else{
            return digits;
        }

    }

}
