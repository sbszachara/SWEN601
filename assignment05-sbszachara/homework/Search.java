//STEVEN SZACHARA
//SWEN 601 HW5

package homework;

public class Search {
    //linearSearch method starts from index 0
    //sees if it matches target, then loops through till it either
    //matches, and returns the index of the target
    //or if not, returns -1
    public static int linearSearch(int[] array, int target) {
        int j = -1;
        for(int i = 0; i < array.length; i++) {
            if (array[i] == target){
                return i;
            }
        }
        return j;
    }
    //binary search uses start, end, and mid
    public static int binarySearch(int[] array, int target) {
        //initializes the start, end and mid variables
        int start = 0;
        int end = array.length - 1;
        int mid;
        //loop to see if the array has been checked through all the way
        while (start <= end) {
            //start with setting mid, and later a new mid, every loop
            mid = (start+end) / 2;
            //if we find the target, return the index
            if (array[mid] == target) {
                return mid;
            }
            else if (start == end) {

            }
            //if the value at the mid is greater than what we are looking for
            //new end is mid - 1
            else if (array[mid] > target) {
                end = mid - 1;
            }
            //if the value at the mid is less than the target
            //new start is mid + 1
            else if (array[mid] < target) {
                start = mid + 1;
            }
        }
        //if we go through the loop, that means the value wasn't there
        //and we return -1
        return -1;

    }

    public static void main(String args[]) {
        int test;
        int[] newarray = {1,2,3,4,5,6,35,26};
        int[] newarray1 = {44,3456,7875,345634,23,435,236,76,456,74567,89867};
        test = linearSearch(newarray, 3);
        System.out.println(test);
        test = binarySearch(newarray, 35);
        System.out.println(test);
        int[] newarray2 = {1,2};
        test = binarySearch(newarray2, 1);
        System.out.println(test);
        test = binarySearch(newarray1, 89867);
        System.out.println(test);
    }
    
}
