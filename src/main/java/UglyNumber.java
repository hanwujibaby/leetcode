/**
 * Created by wei4liverpool on 11/29/16.
 *
 *
 * Write a program to check whether a given number is an ugly number.

 Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

 Note that 1 is typically treated as an ugly number.
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
            System.out.println();
        }
        return n==1;
    }
}



