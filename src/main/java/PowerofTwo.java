/**
 *
 * Given an integer, write a function to determine if it is a power of two.


 * Created by weixing on 17/11/20.
 */
public class PowerofTwo {

  public static void main(String[] args) {

      System.out.print("reuslt:"+isPowerOfTwo(3));

  }


  public static boolean isPowerOfTwo(int n) {
    if(n==1){
        return true;
    }

      int k=1;

      do{
          k=k<<1;
      }while(k<n);
      return k==n?true:false;
  }


}
