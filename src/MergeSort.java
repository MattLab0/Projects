import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.Math.min;

public class MergeSort {

    public static void main (String[] args ) {
        int[] A = {6, 1, 4, 2, 12, 6, 23, 7, 15, 8, 13, 9, 9, 11, 12, 0};
        int size = A.length;
        int[] B = new int[size];

        for (int width=1; width< size ; width= width*2){
            // group 2 then 4, 8 ecc
            for (int i=0; i< size ; i=i+2*width ){
                BottomUpMerge(A, i, min(i+width, size), min(i+2*width, size), B);
            }
            CopyArray(B, A, size);
        }
        System.out.println(Arrays.toString(B));




    }
    public static void BottomUpMerge(int [] A, int iLeft, int iRight, int iEnd, int[] B) {
        int i = iLeft;
        int j = iRight;
        // While there are elements in the left or right runs...
        for (int k = iLeft; k < iEnd; k++) {
            // If left run head exists and is <= existing right run head.
            if (i < iRight && (j >= iEnd || A[i] <= A[j])) {
                B[k] = A[i];
                i = i + 1;
            } else {
                B[k] = A[j];
                j = j + 1;
            }


        }

    }
    public static void CopyArray(int[] B, int[] A, int n)
    {
        for (int i = 0; i < n; i++)
            A[i] = B[i];
    }

}
