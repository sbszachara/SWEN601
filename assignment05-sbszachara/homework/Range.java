//STEVEN SZACHARA
//SWEN 601 HW5
package homework;

public class Range {
    //looking at 3 variables to return an array in the range m to n
    //k is the step between values
    public static int[] makeRange(int m, int n, int k) {
        //initializes the range for how big the new array will be
        int range = 0;
        //calculates the range of the new array
        for(int i = m; i <= n;) {
            i = k + i;
            range = range + 1;
        }
        //creates the array to fill and later return
        int[] placeHolder = new int[range];
        //sets the first value of the array at the starting point
        placeHolder[0] = m;
        //starts at the next value in the array to begin updating
        for(int i = 1; i < range; i++) {
            m = k + m;
            placeHolder[i] = m;
        }
        return placeHolder;
    }

    public static int[] makeRange2(int m, int n) {
        return makeRange(m, n, 1);
    }

    public static int[] makeRange3(int n) {
        return makeRange(0, n, 1);
    }

    public static void main(String[] args) {
        //test cases
        int[] test;
        int[] test2;
        int[] test3;
        int[] test4;
        //set up test cases
        test = makeRange(1, 10, 1);
        test2 = makeRange(2, 11, 2);
        test3 = makeRange(1, 10, 3);
        test4 = makeRange(3, 16, 4);
        //print test cases
        for(int i = 0; i < test.length; i++) {
            System.out.print(test[i]);
        }
        System.out.println();
        for(int i = 0; i < test3.length; i++) {
            System.out.print(test3[i]);
        }
        System.out.println();
        for(int i = 0; i < test2.length; i++) {
            System.out.print(test2[i]);
        }
        System.out.println();
        for(int i = 0; i < test4.length; i++) {
            System.out.print(test4[i]);
        }
        System.out.println();
        

    }
}
