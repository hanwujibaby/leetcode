/**
 * Created by wei4liverpool on 9/19/16.
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
        System.out.println(mid);;
    }

    static boolean isBadVersion(int index,int[] versions){
        return versions[index]%2==0?true:false;
    }






}



