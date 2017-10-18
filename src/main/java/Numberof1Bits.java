import java.util.List;

/**
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

 For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.


 * Created by weixing on 17/10/14.
 */
public class Numberof1Bits {

  public static void main(String[] args) {
    long s=System.currentTimeMillis();
    //System.out.println(Integer.MAX_VALUE);
    System.out.printf("number of bits:"+hammingWeight(2147483648));
    long s1=System.currentTimeMillis();
    System.out.println(s1-s);
    /*
    int j=100;
    for(int i=0;i<100;i++){
      j=j--;
      //j=j--;
    }
    System.out.println(j);
    */
  }

   public class G1{
   public void takeList(List<? extends String> list){
     //insert code here
     //list.add("cmbc");
   }
 }


  // you need to treat n as an unsigned value
  public static int hammingWeight(int n) {
    int x=1;
    int i=0;
    do{
      int k=n^x;
      if((k|(~x))!=-1){
        i++;
      }
      x=x<<1;
    }while(x<=n&x>=0);
    return i;

  }

}
