/**
 * Created by wei4liverpool on 12/13/16.
 *  Given an array and a value, remove all instances of that value in place and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.

 Example:
 Given input array nums = [3,2,2,3], val = 3

 Your function should return length = 2, with the first two elements of nums being 2.

 Hint:

 Try two pointers.
 */
public class RemoveElement {
 public static void main(String[] args) {
  int[] array=removeElement(new int[]{1,2,3,1,1},1);

  for(int i=0;i<array.length;i++){
   System.out.println(array[i]);
  }


 }


 public static int[] removeElement(int[] array,int val){
  int j=array.length-1;

    for(int i=0;i<j;i++){
    if(array[i]==val){
     while(array[j]==val){
      j--;
     }
     int tmp=array[i];
     array[i]=array[j];
     array[j]=tmp;
    }
  }

  return array;

 }

}
