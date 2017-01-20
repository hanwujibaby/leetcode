/**
 * Created by wei4liverpool on 1/20/17.
 * Given an integer n, return the number of trailing zeroes in n!.

 Note: Your solution should be in logarithmic time complexity.
 * 给出一个数,求这个数的阶乘中以0为结尾的0 的个数.时间复杂度需要满足多项式的时间复杂度.


 */
public class Factorial_Trailing_Zeroes {
    public static void main(String[] args) {
        long s=System.currentTimeMillis();
        /*
        System.out.println(trailingZeroes(1808548329));
        long e=System.currentTimeMillis();
        System.out.println("\ncost time:"+(e-s)+"ms");
        System.out.println(trailingZeroes22(1808548329));
        long e1=System.currentTimeMillis();
        System.out.println("\ncost time:"+(e1-e)+"ms");
        */
        System.out.println(Math.floor(127/125));

    }

    public static int trailingZeroes22(int n) {
        //int n2 = 0;
        int n5 = 0;
        if (n == 0) {
            return 0;
        }

        if(n<5){
            return 0;
        }


        int x=5;
        int y=10;
        int step=10;

        do{
            int j=x;
            while(j%5==0){
                n5++;
                j=j/5;
            }
            x=x+5;
            j=x;
            if(x<=n){
                    while(j%5==0){
                        n5++;
                        j=j/5;
                    }
                }
            x=x+5;
        }while(x<=n);

        return n5;

    }


    public static int trailingZeroes(int n) {
        //int n2 = 0;
        int n5 = 0;
        if (n == 0) {
            return 0;
        }
        if(n<5){
            return 0;
        }


        int x=5;
        int y=10;
        int step=10;

        /*
        do{
            int j=x;
            while(j%5==0){
                n5++;
                j=j/5;
            }
            x=x+5;
            j=x;
            if(x<n){
                while(j%5==0){
                    n5++;
                    j=j/5;
                }
            }
            x=x+10;
        }while(x<=n);
        */

        for(int i=n;i>0;i--){
            int j=i;
            while(j%5==0){
                n5++;
                j=j/5;
            }
        }
        return n5;

    }

}
