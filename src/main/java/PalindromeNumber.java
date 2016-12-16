/**
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 * Created by wei4liverpool on 12/9/16.
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindarome(10));
        
    }


    public static boolean isPalindarome(int n){
        if(n<0){
            return false;
        }else if (n==0||n<10){
            return true;
        }else {
            int x=n%10;
            int k=n/10;
            int sum=0;
            sum+=x;

            if(x==0) {
                return false;
            }

            while(k>sum){
                x=k%10;
                k=k/10;
                sum=sum*10+x;
            }

            if(k==sum){
                return true;
            }else if (k<sum){
                if(sum==(k*10+sum%10)){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }


}
