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
        int[] ns=new int[]{1,1,2};
        int[] nss=removeDuplicateNum(ns);
        for(int i=0;i<nss.length;i++) {
            System.out.println(ns[i]);
        }

    }


    public static int[] removeDuplicateNum(int[] nums){
        int index=0;
        int k=0;

        for(int i=0;i<nums.length;i++){
            int j=i+1;
            if(j<nums.length&& nums[j]==nums[i]){
                for(k=j;k<nums.length;k++){
                    if(nums[k]>nums[j]){
                        int tmp=nums[j];
                        nums[j]=nums[k];
                        nums[k]=tmp;
                        i=k;
                        index=k;
                        break;
                    }
                }
            }

        }

        int[] newA=new int[index];
        for(int i=0;i<index;i++){
            newA[i]=nums[i];
        }

        return newA;

    }

}
