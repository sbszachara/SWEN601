package homework;
import java.util.Arrays;

public class Speedtest {
    //speedtest for insertion sort
    public static void speedtest(int[] array) {
        int[] copyarray = Arrays.copyOf(array, array.length);
        System.out.println("Performing Insertion Sort on " + copyarray.length + " elements...");
        if (SortUtilities.isSorted(copyarray) == true){
            System.out.println("    Pre-sorted: true");
        }
        else {
            System.out.println("    Pre-sorted: false");
            long starttime = System.currentTimeMillis();
            Sorts.insertionSort(copyarray);
            long endtime = System.currentTimeMillis();
            System.out.println("    Completed in " + (endtime - starttime) + " milliseconds");
        }
        if (SortUtilities.isSorted(copyarray) == true){
            System.out.println("    Sorted: true");
        }
        else {
            System.out.println("    Sorted: false");
        }

    }
    //speedtest for bubble sort
    public static void speedtestBubble(int[] array) {
        int[] copyarray = Arrays.copyOf(array, array.length);
        System.out.println("Performing Bubble Sort on " + copyarray.length + " elements...");
        if (SortUtilities.isSorted(copyarray) == true){
            System.out.println("    Pre-sorted: true");
        }
        else {
            System.out.println("    Pre-sorted: false");
            long starttime = System.currentTimeMillis();
            Sorts.bubbleSort(copyarray);
            long endtime = System.currentTimeMillis();
            System.out.println("    Completed in " + (endtime - starttime) + " milliseconds");
        }
        if (SortUtilities.isSorted(copyarray) == true){
            System.out.println("    Sorted: true");
        }
        else {
            System.out.println("    Sorted: false");
        }

    }

    //speedtest for quick sort
    public static void speedtestQuick(int[] array) {
        int[] copyarray = Arrays.copyOf(array, array.length);
        System.out.println("Performing Quick sort on " + copyarray.length + " elements...");
        if (SortUtilities.isSorted(copyarray) == true){
            System.out.println("    Pre-sorted: true");
        }
        else {
            System.out.println("    Pre-sorted: false");
            long starttime = System.currentTimeMillis();
            copyarray = Sorts.quicksort(copyarray);
            long endtime = System.currentTimeMillis();
            System.out.println("    Completed in " + (endtime - starttime) + " milliseconds");
        }
        if (SortUtilities.isSorted(copyarray) == true){
            System.out.println("    Sorted: true");
        }
        else {
            System.out.println("    Sorted: false");
        }
    }

    //start main
    public static void main(String args[]) {
        //Testing insertion sort
        System.out.println();
        int[] testarray = SortUtilities.makeArray(100000);
        speedtest(testarray);

        //testing quick sort
        System.out.println();
        int[] testarrayQ = SortUtilities.makeArray(100000);
        speedtestQuick(testarrayQ);

        //testing bubble sort
        System.out.println();
        int[] testarray2 = SortUtilities.makeArray(100000);
        speedtestBubble(testarray2);

        //testing cat
        System.out.println();
        int[] testarray3 = {2,3,4,5,6,7,8,9};
        int[] testarray4 = {5,6,7,8,9,10,11,12,13};
        int[] testarray5 = {14,15,16,17,18};
        int[] testarray6 = {19,20};
        int[] testarray7 = {21};
        System.out.println(Arrays.toString(SortUtilities.cat(testarray3, testarray4, testarray5, testarray6, testarray7)));
        System.out.println();


    }//end main
}//end class
