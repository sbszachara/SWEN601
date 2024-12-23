//STEVEN SZACHARA
//SWEN 601 HW5

package homework;
import java.util.Scanner;

public class Main {

    //make range method from Range.java
    public static int[] makeRange(int m, int n, int k) {
        int range = 0;
        for(int i = m; i <= n;) {
            i = k + i;
            range = range + 1;
        }
        int[] placeHolder = new int[range];
        placeHolder[0] = m;
        for(int i = 1; i < range; i++) {
            m = k + m;
            placeHolder[i] = m;
        }
        return placeHolder;
    }

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
        //Part a
        //create scanner
        Scanner reader = new Scanner(System.in);

        //prompt user for m, n, and k
        System.out.println("Enter value for m:");
        int m = reader.nextInt();
        System.out.println("Enter value for n:");
        int n = reader.nextInt();
        System.out.println("Enter value for k:");
        int k = reader.nextInt();

        //use range menthod to get the length of the new array and print
        System.out.println("The size of your array is:");
        int[] displayArray = makeRange(m,n,k);
        System.out.println(displayArray.length);

        //Part b
        //setting up arrays to test
        int[] test = new int[10000000];
        int[] test2 = new int[10000000];
        int creator = 15;
        for(int i = 0; i < test.length-1; i++){
            test[i] = creator + 36;
            test2[i] = creator + 25;
            creator = creator + 1;
        }
        //initialize user target and result if correct value
        int targetValue = 1;
        int result = -1;

        while(targetValue >= 0) {
            System.out.println("Enter a target value:");
            targetValue = reader.nextInt();
            if(targetValue == 0) {
                break;
            }
            else {
                //linearsearch for test
                long startlinearSearch = System.currentTimeMillis();
                result = linearSearch(test, targetValue);
                long endlinearSearch = System.currentTimeMillis();
                long totalLin = endlinearSearch - startlinearSearch;
                if (result != -1) {
                    System.out.println("Result was found in test.");
                }
                else {
                    System.out.println("Result was not found in test.");
                }
                System.out.println("Linear Search time: " + totalLin + "ms");
                //binary search for test
                long startBSearch = System.currentTimeMillis();
                result = binarySearch(test, targetValue);
                long endBSearch = System.currentTimeMillis();
                long totalBin = endBSearch - startBSearch;
                if (result != -1) {
                    System.out.println("Result was found in test.");
                }
                else {
                    System.out.println("Result was not found in test.");
                }
                System.out.println("Binary Search time: " + totalBin + "ms");
                long difference1 = totalLin - totalBin;
                System.out.println("The difference between is " + difference1 + "ms");

                //linear search for test2
                startlinearSearch = System.currentTimeMillis();
                result = linearSearch(test2, targetValue);
                endlinearSearch = System.currentTimeMillis();
                totalLin = endlinearSearch - startlinearSearch;
                if (result != -1) {
                    System.out.println("Result was found in test2.");
                }
                else {
                    System.out.println("Result was not found in test2.");
                }
                System.out.println("Linear Search time: " + totalLin + "ms");

                //binary search for test2
                startBSearch = System.currentTimeMillis();
                result = binarySearch(test2, targetValue);
                endBSearch = System.currentTimeMillis();
                totalBin = endBSearch - startBSearch;
                if (result != -1) {
                    System.out.println("Result was found in test2.");
                }
                else {
                    System.out.println("Result was not found in test2.");
                }
                difference1 = totalLin - totalBin;
                System.out.println("Binary Search time: " + totalBin + "ms");
                System.out.println("The difference between is " + difference1 + "ms"); 


            }
        }



    }
}
