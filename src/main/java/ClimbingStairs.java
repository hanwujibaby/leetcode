import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by wei4liverpool on 12/27/16.
 * <p>
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * solusion:递归求解,最后到达n的时候,一定是n-1,或者n-2,得出递归公司f(n)=f(n-1)+f(n-2);但是由于复杂度过高,dp的话,要求递归+缓存;故存上之前的值.
 */
public class ClimbingStairs {

    static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        long s1 = System.currentTimeMillis();
        System.out.println(climbStairs(30));
        System.out.println(System.currentTimeMillis() - s1 + "ms");
        Thread d=new Thread();
        d.run();


    }


    public static int climbStairs(int n) {
        if (n <= 3) {
            map.put(n, n);
            return n;
        }
        Integer x = map.get(n);
        if (x != null) {
            return x;
        }
        int n1 = climbStairs(n - 1);
        int n2 = climbStairs(n - 2);
        map.put(n, n1 + n2);
        return n1 + n2;
    }

}
