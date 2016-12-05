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
        int[] versions=new int[]{1,2,3,5,6,7,7,8};
        int start =0;
        int end=versions.length-1;
        int mid=end>>1;
        while(start<=end){
            if(isBadVersion(mid,versions)){
                end=mid;
            }else{
                start=mid;
            }
        }
        System.out.println(mid);
    }

    static boolean isBadVersion(int index,int[] versions){
        return versions[index]%2==0?true:false;
    }

}



