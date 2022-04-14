import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class JoinNOrderedArray {

    public static int[] joinArray(int[] fstArray, int[] scnArray) {
        int[] joinedArray = new int[fstArray.length + scnArray.length];
        int j = 0;
        int k = 0;
        boolean flagDone1 = false;
        boolean flagDone2 = false;

        for (int i = 0; i < (fstArray.length + scnArray.length); i++) {
            if (fstArray[j] <= scnArray[k] && !flagDone1) {
                joinedArray[i] = fstArray[j];
                if (j < fstArray.length - 1) {
                    j++;
                } else flagDone1 = true;
            } else if (!flagDone2) {
                joinedArray[i] = scnArray[k];

                if (k < scnArray.length - 1) {
                    k++;
                } else flagDone2 = true;

            }
                    }
        return joinedArray;
    }

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Matteo\\IdeaProjects\\FraProjects\\src\\ArraysInput.txt");

            Scanner sc = new Scanner(file);

            //Count array number, skip setup line
            int numOfArray=0;
            sc.nextLine();
            while (sc.hasNextLine())
            {
                numOfArray ++;
                sc.nextLine();
            }

            Scanner sc2 = new Scanner(file);
            int size = Integer.parseInt(sc2.nextLine()); //get size from set up line
            int[] arr = new int[size];
            int[] combArr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc2.nextInt();
            }
            combArr= arr.clone(); //no direct copy otherwise ID mix

            for (int j=1 ; j<numOfArray; j++) {
                if (sc2.hasNextLine()) {
                    sc2.nextLine();
                }
                for (int i = 0; i < size; i++) {
                    arr[i] = sc2.nextInt();
                }
                combArr= joinArray(combArr, arr);

            }

            System.out.println(Arrays.toString(combArr));


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
