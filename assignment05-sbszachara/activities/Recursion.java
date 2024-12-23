package activities;

public class Recursion {

    public static void countDown(int n) {
        while( n >= 0) {
            System.out.println(n);
            n--;
        }
    }

    public static void countUP(int n) {
        if (n < 0) {
            return;
        }
        else {
            countUP(n-1);
            System.out.println(n);
        }
            
        }

    public static void countDownRec(int r) {
        if (r >= 0)
        {
            System.out.println(r);
            r--;
            countDownRec(r);
        }
        else {
            return;
        }
    }

    public static long factorial(long n) {
        if (n < 0) {
            return -1; //undefined
        }
        else if (n == 0) {
            return 1;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    public static long Fibonacci(long n) {
        if (n < 0){
            return -1;
        }
        else if (n == 1 || n == 2){
            return n - 1;
        }
        else {
            long fn_1 = Fibonacci(n-1);
            long fn_2 = Fibonacci(n-2);
            return fn_1 + fn_2;
        }
    }

    public static boolean search(int[] array, int target) {
        for(int i = 0; i < array.length; i++)
        {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        countDown(10);
        countDownRec(10);
        countUP(15);
        System.out.println(factorial(10));
        System.out.println(Fibonacci(25));
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(search(array, 3));
    }

}
