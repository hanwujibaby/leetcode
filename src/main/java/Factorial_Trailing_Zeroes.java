/**
 * Created by wei4liverpool on 1/20/17.
 * Given an integer n, return the number of trailing zeroes in n!.

 Note: Your solution should be in logarithmic time complexity.
 * 给出一个数,求这个数的阶乘中以0为结尾的0 的个数.时间复杂度需要满足多项式的时间复杂度.
 *
 *
 * Solution:分析题意可知只要判断5的个数即可,只要有1个2,5的个数就会决定0的个数.所以要对5的n次方用number进行相除;求和即可.
 * 同时需要注意处理一下整形数越界的问题


 */
public class Factorial_Trailing_Zeroes {
    public static void main(String[] args) {
        long s=System.currentTimeMillis();
        //System.out.println(trailingZeroes(1808548329));
        System.out.println(trailingZeroes(1808548329));
        long e=System.currentTimeMillis();
        System.out.println("\ncost time:"+(e-s)+"ms");
        System.out.println(trailingZeroes3(1808548329));
        long e1=System.currentTimeMillis();
        System.out.println("\ncost time:"+(e1-e)+"ms");

    }

    public static int trailingZeroes3(int n){
        int sum=0;
        long factor=5;
        double s=0;
        if (n == 0) {
            return 0;
        }

        if(n<5){
            return 0;
        }

        int i=0;
        do{
            s=Math.floor(n/(factor));
            i++;
            sum+=s;
            factor=5*factor;
            if(factor>Integer.MAX_VALUE){
                break;
            }

        }while(s>0 && factor<=n);

        return sum;

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
