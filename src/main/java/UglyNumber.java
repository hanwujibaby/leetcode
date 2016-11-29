/**
 * Created by wei4liverpool on 11/29/16.
 */
public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(checkUglyNumber(15));

    }
    static boolean checkUglyNumber(int n){
        while(n>=2){
            if(n%2==0){
                n=n/2;
            }else if(n%3==0){
                n=n/3;

            }else if(n%5==0){
                n=n/4;
            }else{
                return false;
            }
        }
        return n==1;
    }
}



