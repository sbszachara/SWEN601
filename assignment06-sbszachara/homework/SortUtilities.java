package homework;
import java.util.Arrays;
import java.util.Random;

public class SortUtilities {
    private static final Random RNG = new Random(1);

    //cat method
    static int[] cat(int[] ... arrays) {
        //i is for the array inner value
        int i = 0;
        //prepping lengths for the arrays to create the new arraay
        int arraylength = 0;
        //seeing how many arrays and what their lengths are
        for (int[] array : arrays){
            arraylength = arrays[i].length + arraylength;
            i = i + 1;
        }
        //making the new array to hold all the arrays values
        int[] newarrayreturn = new int[arraylength];
        //reset the counter
        i = 0;
        //tracking the array position
        int arrayposition = 0;
        //iterate through the array of arrays again
        for (int[] array : arrays){
            //use array copy to copy in the values into the new array
            System.arraycopy(arrays[i], 0, newarrayreturn, arrayposition, arrays[i].length);
            //adjust the position of the new array to add onto
            arrayposition = arrayposition + arrays[i].length;
            //iterate to the next array
            i = i + 1;
        }
        return newarrayreturn;
    }

    public static int[] makeArray(int size) {
        int[] newarray = new int[size];
        for (int i = 0; i<newarray.length; i++) {
            newarray[i] = RNG.nextInt(size);
        }
        return newarray;
    }
    
    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1]){
                return false;
            }

        }
        return true;
    }

    public static void swap(int[] array, int a, int b) {
        int swapp = array[a];
        array[a] = array[b];
        array[b] = swapp;
    }

    public static void main (String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        int[] arr2 = {1,2,3,2,1,4,5,6};

        System.out.println(isSorted(arr1));
        System.out.println(isSorted(arr2));
        swap(arr1, 2, 4);
        System.out.println(Arrays.toString(arr1));
        swap(arr1, 4, 2);
        System.out.println(Arrays.toString(arr1));
        int[] arr3 = makeArray(17);
        System.out.println(Arrays.toString(arr3));

    }
}
