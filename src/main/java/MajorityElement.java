/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

    You may assume that the array is non-empty and the majority element always exist in the array.


 * Created by wei4liverpool on 1/22/17.
 */
public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1,3,3,3}));



    }


    public static int majorityElement(int[] nums) {
        int count=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                n=nums[i];
                count++;
            }else if(n==nums[i]){
                count++;
            }else if(n!=nums[i]){
                count--;
            }
        }
        return n;
    }
}
