/**
 * Created by wei4liverpool on 12/1/16.
 */
public class MoveZeros {


    public static void main(String[] args) {
        int[] a={0,1,4,3,12,0,0};

        int[] as=moveZero(a);
        for(int i=0;i<as.length;i++){
            System.out.println(as[i]+" ");
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



