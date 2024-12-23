package homework;
import java.util.Arrays;

public class Sorts {
    //method for insertion sort from class
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int index = i;
            while(index > 0 && array[index] < array[index-1]){
                SortUtilities.swap(array, index, index-1);
                index--;
            }
        }
    }

    //method for bubble sort
    public static void bubbleSort(int[] array) {
        //go through the whole array
        for (int i = 0; i < (array.length-1); i++) {
            //see if there was a swap
            boolean swap = false;
            //go through the whole array to swap if there is a value
            for (int j = 0; j < (array.length-1); j++) {
                if (array[j] > array[j+1]) {
                    int o = array[j];
                    array[j] = array[j+1];
                    array[j+1] = o;
                    swap = true;
                }
            }
            //if there was a swap, break the continual loop
            if (swap = false) {
                break;
            }
        }
    }

    public static int[] quicksort(int[] array) {
        //return the array if it is less than 2
        if (array.length < 2){
            return array;
        }
        //initialize pivot and new 3 values to count and make the arrays
        int pivot = array[0];
        int greater = 0;
        int lessthan = 0;
        int equal = 0;

        //count the greater, less than, equal to
        for(int i = 0; i < array.length; i++){
            if (pivot == array[i]){
                equal = equal + 1;
            }
            else if (pivot > array[i]){
                lessthan = lessthan + 1;
            }
            else {
                greater = greater + 1;
            }
        }
        
        //create arrays based on above
        int[] greaterArray = new int[greater];
        int[] lessthanArray = new int[lessthan];
        int[] equalArray = new int[equal];

        //keep track of places in above arrays
        int greaterplace = 0;
        int lessthanplace = 0;
        int equalplace = 0;

        //add values to said arrays
        for(int i = 0; i < array.length; i++){
            if (pivot == array[i]){
                equalArray[equalplace] = array[i];
                equalplace = equalplace + 1;
            }
            else if (pivot > array[i]){
                lessthanArray[lessthanplace] = array[i];
                lessthanplace = lessthanplace + 1;
            }
            else {
                greaterArray[greaterplace] = array[i];
                greaterplace = greaterplace + 1;
            }
        }
        //store values and call recursion
        int[] sortedlessthan = quicksort(lessthanArray);
        int[] sortedgreaterthan = quicksort(greaterArray);

        //cat sorted and equal array
        int[] finalArray = SortUtilities.cat(sortedlessthan, equalArray, sortedgreaterthan);
        return finalArray;
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
