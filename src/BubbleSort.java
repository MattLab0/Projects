import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args){
        int [] array1 = {0, 5, 1, 6, 2, 12, 6, 23, 7, 15,  8, 13,  9, 9, 11, 12};
        // int [] array1 = {12, 11 ,10,9,8,7,6,5,4,3,2,1}; //worst case

        //int j=1;
        boolean allSwap= false;

        for ( int j=1 ; j < array1.length; j++ ) {
            for ( int i=0 ; i< array1.length -j ; i++ ) {
                if (array1[i] > array1[i+1] ){
                    int dummy = array1[i+1];
                    array1[i+1]= array1[i];
                    array1[i]=dummy;
                }
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}
