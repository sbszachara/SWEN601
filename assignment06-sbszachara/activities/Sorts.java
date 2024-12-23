package activities;
import java.util.Arrays;

public class Sorts {
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int index = i;
            while(index > 0 && array[index] < array[index-1]){
                SortUtilities.swap(array, index, index-1);
                index--;
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static int[][] divide(int[] array) {
        int len1 = array.length / 2;
        int len2 = array.length - len1;
        int[] left = new int[len1];
        int[] right = new int[len2];

        for(int i = 0; i<len1; i++) {
            left[i] = array[i];
        }

        for(int i = 0; i<len2; i++) {
            right[i] = array[i+len1];
        }


        return new int[][]{left, right};
    }

    public static int[] merge(int[] a, int[] b) {
        int[] merged =  new int[a.length + b.length];
        int indexa = 0;
        int indexb = 0;
        int indexm = 0;

        while(indexa < a.length && indexb < b.length) {
            if(a[indexa] < b[indexb]) {
                merged[indexm] = a[indexa];
                indexa++;
                indexm++;
            }
            else {
                merged[indexm] = b[indexb];
                indexb++;
                indexm++;
            }
        }

        if (indexa < a.length) {
            for(int i=indexa; i<a.length; i++, indexm++) {
                merged[indexm] = a[i];
            }
        }
        else {
            for(int i=indexb; i<b.length; i++, indexm++) {
                merged[indexm] = b[i];
            }
        }

        return merged;
    }

    public static void main(String[] args){
        int[] array = SortUtilities.makeArray(19);
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
