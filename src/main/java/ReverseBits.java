import static java.lang.Byte.parseByte;
import static java.lang.Byte.toUnsignedInt;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by weixing on 17/10/18.

 Reverse bits of a given 32 bits unsigned integer.

 For example, given input 43261596 (represented in binary as 00000010100101000001111010011100),
 return 964176192 (represented in binary as 00111001011110000010100101000000).

 对1不断的左移32次，然后对的结果存储到stack中，然后从stack中弹出，并不断的以2*累积相加；

 */
public class ReverseBits {

  public static void main(String[] args) {
    System.out.println(reverseBits(1));
  }

  public static int reverseBits(int n) {
    int x=1;
    Stack<Integer> stack=new Stack<Integer>();
    ArrayList<Integer> list=new ArrayList<Integer>();
    for(int i=0;i<32;i++){
      int k=n^x;
      //说明该位为1
      if((k|(~x))!=-1){
        stack.push(1);
        list.add(1);
      }else{
        stack.push(0);
        list.add(0);
      }
      x=x<<1;
    }

    long sum=0;
    int m=0;
    StringBuilder sb=new StringBuilder();
    while(stack.isEmpty()==false){
      sum+=stack.pop()*Math.pow(2,m);
      m++;
    }
    return Integer.parseUnsignedInt(Long.valueOf(sum).toString());

  }

}
