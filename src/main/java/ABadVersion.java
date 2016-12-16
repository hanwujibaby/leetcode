/**
 * Created by wei4liverpool on 9/19/16.
 *
 *
 *
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

 Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

 You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */
public class ABadVersion {

    public static void main(String[] args) {

        int[] aaa=new int[]{1,2,3,4,5,6,7,8,9};
    }

    public static int firstBadVersion(int n) {
        int start =1;
        int end=n;
        while(start<end){
            //有可能溢出,所以只能end-start,而不能(end+start)/2
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }

    static boolean isBadVersion(int n){
        return true;
    }

}



