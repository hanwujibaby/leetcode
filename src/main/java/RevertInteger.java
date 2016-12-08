import java.util.Stack;

/**
 * Created by wei4liverpool on 12/5/16.
 *
 *
 * Reverse digits of an integer.
 Example1: x = 123, return 321
 Example2: x = -123, return -321
 click to show spoilers.
 Have you thought about this?
 Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
 If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
 Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?
 Throw an exception? Good, but what if throwing an exception is not an option? You would then have to re-design the function (ie, add an extra parameter).

 */
public class RevertInteger {

    public static void main(String[] args) {
        int k=1000000003;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.println(min);
        System.out.println(revert(k));
    }

    public static int reverse(int x){
        int rst = 0;

        while(x != 0) {
            int next_rst = rst * 10 + x % 10;
            x = x / 10;
            if(next_rst/10 != rst) {
                rst  = 0;
                break;
            }
            rst = next_rst;
        }
        return rst;
    }


    public static int revert(int num){
        Stack<Integer> stack=new Stack<Integer>();
        int originNum=num;
        if(num<0){
            num=Math.abs(num);
        }

        if(num<10){
            return num;
        }

        while(num/10>0){
            int x=num/10;
            int k=(num-x*10)%10;
            num=x;
            stack.add(k);
        }
        stack.add(num);

        int sum=0;
        int i=0;
        while(!stack.empty()){
            int factor=1;
            int presum=0;
            for(int j=0;j<i;j++){
                factor*=10;
            }
            presum=num;
            sum=sum+stack.pop()*factor;
            //利用前一个值和后一个值的倍数来确定是否溢出
            if(sum/10!=presum){
                return 0;
            }

            i++;
        }
        return originNum<0?sum*(-1):sum;

    }

}
