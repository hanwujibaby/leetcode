import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 * 求小于n的素数（不能被其他数整除的素数）
 * 参考Sieve of Eratosthenes算法：https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

 * Created by weixing on 17/11/17.
 */
public class CountPrimes {

  public static void main(String[] args) {


    long s=System.currentTimeMillis();
    System.out.println(countPrimes(999983));
    long s1=System.currentTimeMillis();
    System.out.printf("cost time:"+(s1-s)+"ms");


  }

  public static int countPrimes(int n) {

    if(n==2){
      return 0;
    }

    int[] list=new int[n];
    for(int i=1;i<=n-1;i++){
      list[i]=i;
    }


    ArrayList<Integer> factorList=new ArrayList<Integer>();

    for(int i=2;i<=n-1;i++){
      int j=1;
      if(i*i>n){
        break;
      }

      boolean flag=false;
      for(int p=0;p<factorList.size();p++){
        if(i%factorList.get(p)==0){
          flag=true;
          break;
        }
      }

      if(flag){
        continue;
      }

      int s=i*i;
      while(s<=n-1){
        list[s]=-1;
        if(j==1){
          factorList.add(i);
        }
        s=i*i+j*i;
        j++;
      }

    }

    int l=0;
    for(int i=0;i<list.length;i++){
      if(list[i]>=2){
        //System.out.printf("number:"+list[i]+"\n");
        l++;
      }
    }
    return l;


  }

}
