import java.util.HashMap;
import java.util.Map;

/**
 * Write an algorithm to determine if a number is "happy".

 A happy number is a number defined by the following process: Starting with any positive integer,
 replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay),
 or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

 Example: 19 is a happy number

 1*1 + 9*9 = 82
 8*8 + 2*2 = 68
 6*6 + 8*8 = 100
 1*1 + 0*0 + 0*0 = 1
 *
 * Created by weixing on 17/10/31.
 */
public class HappyNumber {

  public static void main(String[] args) {

    System.out.println(isHappy(19));

  }


  public static boolean isHappy(int n) {
    Map map=new HashMap<Integer,Integer>();
    int sum=0;

    while(sum!=1){

      if(map.containsKey(sum) && ((Integer)map.get(sum)>1)){
        return false;
      }
      sum=0;

      //小于10
      if(n<10){
        sum=n*n;
        if(map.containsKey(sum)){
          int s=(Integer)map.get(sum);
          map.put(sum,s+1);
        }else{
          map.put(sum,1);
        }
        n=sum;
      }else{
        int x=n/10;
        while(x>0){
          int k=n-x*10;
          sum+=k*k;
          n=x;
          x=n/10;
          if(x==0){
            x=n%10;
            break;
          }
        }
        sum+=x*x;
        if(map.containsKey(sum)){
          int s=(Integer)map.get(sum);
          map.put(sum,s+1);
        }else{
          map.put(sum,1);
        }
        if(sum!=1){
          n=sum;
        }

      }
    }
    return true;

  }

}
