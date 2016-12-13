/**
 * Created by wei4liverpool on 12/13/16.
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 *
 *
 *
 */
public class Remove_Duplicates_From_Sorted_Array {
    public static void main(String[] args) {
        int[] ns=new int[]{1,2,2,3,3,3,5,5,6,7,8,9,9};
        int idx=removeDuplicateNum(ns);
        System.out.println(idx);
        /*for(int i=0;i<ns.length;i++){
            System.out.println(ns[i]);
            */

    }


    public static int removeDuplicateNum(int[] nums){
        int index=0;
        int n=index+1;
        int k=0;
        boolean flag=false;

        do{
            while(n<nums.length&&nums[n]<=nums[index]){
                n++;
            }

            if(n<nums.length){
                nums[index+1]=nums[n];
            }
            index=index+1;
            k=index;
            k++;
        }while(k<nums.length&&n<nums.length);


        return index;

    }

}
