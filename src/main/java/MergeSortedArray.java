/**
 * Created by wei4liverpool on 12/29/16.
 *
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

 Note:
 You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 The number of elements initialized in nums1 and nums2 are m and n respectively.

 solution:2个数组都从后向前遍历;当一个遍历之后为0;则将另一个剩余的进行遍历;

 */
public class MergeSortedArray {

    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int index=n+m-1;

        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[index--]=nums1[i--];
            }else{
                nums1[index--]=nums2[j--];
            }
        }

        while(i>=0){
            nums1[index--]=nums1[i--];

        }

        while(j>=0){
            nums1[index--]=nums2[j--];
        }

    }
}
