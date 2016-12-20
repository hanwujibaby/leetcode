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
        System.out.println(checkUglyNumber(-12));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }

    static boolean checkUglyNumber(int n){
        if(n==0){
            return false;
        }

        if(n==1){
            return true;
        }

        while(n%2==0){
            n=n>>1;
        }
        while(n%3==0){
            n=n/3;
        }
        while(n%5==0){
            n=n/5;
        }
        return n==1;
    }
}



