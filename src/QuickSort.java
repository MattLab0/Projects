import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args){

        int [] arr = {10, 5, 1, 6, 2, 12, 6, 23, 7, 15,  8, 13,  9, 9, 11, 12};

       arr=quicksort(arr);
       int pivot= arr[arr.length-1];
       int size= arr.length-1;
        int[] arrL = new int [pivot];
        int[] arrR = new int [size-pivot];
        for (int i=0; i< pivot; i++){

            arrL[i]=arr[i];
        }
        for (int i=pivot; i< arr.length-1; i++){

            arrR[i-pivot]=arr[i];
        }

        System.out.println(Arrays.toString(arr));



    }

    public static int[] quicksort(int[] arr){
        int pivot = 0;
        int pivLX = 0;
        int pivRX = arr.length-1;
        int dummy=0;
        boolean swap= false;
        while (pivLX!=pivRX){
            if(!swap) {
                if (arr[pivot] < arr[pivRX]) {
                    pivRX = pivRX - 1;
                } else {
                    dummy = arr[pivot];
                    arr[pivot] = arr[pivRX];
                    arr[pivRX] = dummy;
                    pivot = pivRX;
                    swap = true;
                }
            }
            else {
                if (arr[pivLX] < arr[pivot]) {
                    pivLX = pivLX + 1;
                } else {
                    dummy = arr[pivot];
                    arr[pivot] = arr[pivLX];
                    arr[pivLX] = dummy;
                    pivot = pivLX;
                    swap=false;
                }
            }
        }
        int [] supArr= new int[arr.length+1];

        for (int i=0; i< arr.length; i++){
            supArr[i]=arr[i];
        }
        supArr[arr.length]=pivot;
        return supArr;

    }
}
