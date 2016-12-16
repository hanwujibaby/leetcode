/**
 * Created by wei4liverpool on 12/1/16.
 *
 *
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.
 */
public class MoveZeros {


    public static void main(String[] args) {
        int[] a={0,1,4,3,12,0,0};

        int[] as=moveZero(a);
        for(int i=0;i<as.length;i++){
            System.out.println(as[i]+" ");
        }
    }


    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }

        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }


    }


    static int[] moveZero(int[] array){
        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                array[index++]=array[i];
            }
        }

        for(int i=index;i<array.length;i++){
            array[i]=0;
        }

        return array;
    }


}



