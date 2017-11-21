/**
 *
 * Given an integer, write a function to determine if it is a power of two.


 * Created by weixing on 17/11/20.
 */
public class PowerofTwo {

  public static void main(String[] args) {


      long s1=System.currentTimeMillis();
      System.out.print("reuslt:"+isPowerOfTwo(1073741825)+"\n");
      long s2=System.currentTimeMillis();
    System.out.print("cost time:"+(s2-s1)+"ms");

  }


  public static boolean isPowerOfTwo(int n) {
    if(n==1){
        return true;
    }

      int k=1;

      do{
          k=k<<1;
      }while(k<n&&k>0);
      return k==n?true:false;
  }


}
