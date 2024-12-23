package activities;
import java.util.Arrays;
import java.util.Random;

public class SortUtilities {
    private static final Random RNG = new Random(1);

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
