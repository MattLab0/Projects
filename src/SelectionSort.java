import java.util.Arrays;

public class SelectionSort {
    
    public static void main (String[] args ){
        int [] array1 = {0, 5, 1, 6, 2, 12, 6, 23, 7, 15,  8, 13,  9, 9, 11, 12};

        int min = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < array1[min])
                min = i;
        }
        int dummy = array1[0];
        array1[0]= array1[min];
        array1[min]=dummy;

        for (int i = 1; i < array1.length; i++) {
            min=i;
            for( int j = i + 1 ; j <array1.length; j++ ){
                if (array1[j] < array1[min])
                    min = j;

            }
            dummy = array1[i];
            array1[i]= array1[min];
            array1[min]=dummy;

        }

        System.out.println(Arrays.toString(array1));


    }
}
